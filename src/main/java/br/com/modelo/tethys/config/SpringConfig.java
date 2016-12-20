package br.com.modelo.tethys.config;

import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean(name = "project")
	@Qualifier(value = "project")
	public ResourceBundle project() {
		return ResourceBundle.getBundle("project");
	}
}
