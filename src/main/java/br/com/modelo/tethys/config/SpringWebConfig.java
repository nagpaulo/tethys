package br.com.modelo.tethys.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"br.com.modelo.tethys.controllers"})
@PropertySource("classpath:project.properties")
@EnableGlobalMethodSecurity(securedEnabled = true , jsr250Enabled = true, proxyTargetClass = true)//Needs to be here or will not work for the controllers
public class SpringWebConfig extends WebMvcConfigurerAdapter{
private List<String> allowedOrigins = new ArrayList<>();
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**")
            .addResourceLocations("/resources/");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver  = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	MappingJackson2HttpMessageConverter converter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		return converter;
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {		
		/*allowedOrigins.add("http://alunoonline.seduc.ce.gov.br");
		allowedOrigins.add("http://aluno.seduc.ce.gov.br");
		allowedOrigins.add("http://bolsapaic.seduc.ce.gov.br");	*/
		
		registry.addMapping("/**").allowedOrigins(allowedOrigins.toArray(new String[allowedOrigins.size()]));
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {		
		super.configureMessageConverters(converters);
	}
}
