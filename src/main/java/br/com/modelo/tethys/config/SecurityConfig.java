package br.com.modelo.tethys.config;

import java.util.Calendar;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.session.HttpSessionEventPublisher;

import br.com.modelo.tethys.auth.model.Modulo;
import br.com.modelo.tethys.auth.model.Usuario;
import br.com.modelo.tethys.auth.model.UsuarioAcesso;
import br.com.modelo.tethys.auth.repository.ModuloRepository;
import br.com.modelo.tethys.auth.repository.UsuarioAcessoRepository;
import br.com.modelo.tethys.auth.repository.UsuarioRepository;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}
	
	@Bean
	public HttpSessionEventPublisher httpSessionEventPublisher() {
	    return new HttpSessionEventPublisher();
	}

	@Autowired
	private UsuarioAcessoRepository usuarioAcessoRepository;
	
	@Autowired
	private ModuloRepository moduloRepository;
	
	@Autowired
    private UsuarioRepository userRepository;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/resources/**", "/api/esqueceusenha", "/api/registration").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/api/login").permitAll()
			.and().logout().addLogoutHandler(new LogoutHandler() {
				
				@Override
				public void logout(HttpServletRequest arg0, HttpServletResponse arg1, Authentication arg2){
						ResourceBundle resource = ResourceBundle.getBundle("project");
				    	Long moduloId = Long.parseLong(resource.getString("modulo.id"));
				    	Modulo modulo = moduloRepository.findOne(moduloId);    	
				    	
				    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
				    	String username = auth.getName();
				    	
				    	Usuario usuario = userRepository.findByLogin(username);
						UsuarioAcesso access = usuarioAcessoRepository.findByUsuarioAndModulo(usuario, modulo);
						access.setDataFim(Calendar.getInstance().getTime());
						usuarioAcessoRepository.save(access);

				}
			}).permitAll();
		
		http.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
		
		http.sessionManagement().maximumSessions(30).expiredUrl("/sessionExpired.html");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
	}
}
