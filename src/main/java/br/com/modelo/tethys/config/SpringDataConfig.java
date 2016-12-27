package br.com.modelo.tethys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
public class SpringDataConfig {
	@Configuration
	@EnableJpaRepositories(basePackages = {"br.com.modelo.tethys.dao.postgres","br.com.modelo.tethys.auth.repository","br.com.modelo.tethys.auth.repository"}, 
		transactionManagerRef="postgresTransactionManager" , entityManagerFactoryRef = "entityManagerFactoryPostgres")
	public static class DummyToConfigSpringDataPostgres{
		
	}
}
