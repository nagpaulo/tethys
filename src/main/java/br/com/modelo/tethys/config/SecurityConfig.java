package br.com.modelo.tethys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/*
	      EXAMPLE OF AUTHENTICATION AND AUTHORIZATION
	      
	      http.authorizeRequests()
	      .antMatchers("/url1").hasRole("ADMIN")
	      .antMatchers("/url2/**").permitAll()
	      .antMatchers(HttpMethod.POST,"/specificUrl").hasRole("ADMIN")
	      .antMatchers("/url3/**").permitAll()
	      .anyRequest().authenticated()
	      .and()
	      .formLogin().loginPage("/login").permitAll()
	      .and()
	      .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	     */
		
		http.csrf().disable();
	}

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
}
