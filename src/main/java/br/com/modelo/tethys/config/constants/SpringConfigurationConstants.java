package br.com.modelo.tethys.config.constants;

public interface SpringConfigurationConstants {
	
	//XXX PROJECT PROPERTIES
	String PROJECT_CONFIGURATION_FILE_BUNDLE_BEAN_ALIAS = "database";
	String PROJECT_CONFIGURATION_FILE_BUNDLE_BEAN_QUALIFIER = "database";
	String PROJECT_CONFIGURATION_FILE_NAME = "project";
	
	//XXX POSTGRE CONSTANTS
	String POSTGRE_DATA_SOURCE_BEAN_ALIAS = "postgresDataSource";
	String POSTGRE_DATA_SOURCE_BEAN_QUALIFIER = "postgresDataSource";
	
	String POSTGRE_MANAGER_FACTORY_BEAN_ALIAS = "entityManagerFactoryPostgres";
	String POSTGRE_MANAGER_FACTORY_BEAN_QUALIFIER = "entityManagerFactoryPostgres";
	
	String POSTGRE_SQL_FACTORY_BEAN_ALIAS = "postgresSqlFactory";
	String POSTGRE_SQL_FACTORY_BEAN_QUALIFIER = "postgresSqlFactory";
	
	String POSTGRE_MYBATIS_MAPPER_SCANNER_BEAN_ALIAS = "postgresMapperScannerConfigurer";
	String POSTGRE_MYBATIS_MAPPER_SCANNER_BEAN_QUALIFIER = "postgresMapperScannerConfigurer";
	
	String POSTGRE_TRANSACTION_MANAGER_BEAN_ALIAS = "postgresTransactionManager";
	String POSTGRE_TRANSACTION_MANAGER_BEAN_QUALIFIER = "postgresTransactionManager";
	
	String POSTGRE_TRANSACTION_TEMPLATE_BEAN_ALIAS = "postgresTransactionTemplate";
	String POSTGRE_TRANSACTION_TEMPLATE_BEAN_QUALIFIER = "postgresTransactionTemplate";
	
	String POSTGRE_PERSISTENT_UNIT_NAME = "postgresPU";
	
	String[] POSTGRE_ENTITY_PACKAGES_TO_SCAN = new String[]{
		"br.gov.ce.seduc.security.entity",
		"br.gov.ce.seduc.wsmodelo.entity.postgres"
	}; 	
													
	String POSTGRE_MYBATIS_MAPPER_PACKAGE_TO_SCAN = "br.gov.ce.seduc.wsmodelo.dao.mappers.postgres";
	
	//XXX ORACLE CONSTANTS
	String ORACLE_DATA_SOURCE_BEAN_ALIAS = "oracleDataSource";
	String ORACLE_DATA_SOURCE_BEAN_QUALIFIER = "oracleDataSource";
	
	String ORACLE_MANAGER_FACTORY_BEAN_ALIAS = "entityManagerFactoryOracle";
	String ORACLE_MANAGER_FACTORY_BEAN_QUALIFIER = "entityManagerFactoryOracle";
	
	String ORACLE_SQL_FACTORY_BEAN_ALIAS = "oracleSqlFactory";
	String ORACLE_SQL_FACTORY_BEAN_QUALIFIER = "oracleSqlFactory";
	
	String ORACLE_MYBATIS_MAPPER_SCANNER_BEAN_ALIAS = "oracleMapperScannerConfigurer";
	String ORACLE_MYBATIS_MAPPER_SCANNER_BEAN_QUALIFIER = "oracleMapperScannerConfigurer";
	
	String ORACLE_TRANSACTION_MANAGER_BEAN_ALIAS = "oracleTransactionManager";
	String ORACLE_TRANSACTION_MANAGER_BEAN_QUALIFIER = "oracleTransactionManager";
	
	String ORACLE_TRANSACTION_TEMPLATE_BEAN_ALIAS = "oracleTransactionTemplate";
	String ORACLE_TRANSACTION_TEMPLATE_BEAN_QUALIFIER = "oracleTransactionTemplate";
	
	String ORACLE_PERSISTENT_UNIT_NAME = "oraclePU";
	
	String[] ORACLE_ENTITY_PACKAGES_TO_SCAN = new String[]{		
		"br.gov.ce.seduc.wsmodelo.entity.oracle"
	}; 
	
	String ORACLE_MYBATIS_MAPPER_PACKAGE_TO_SCAN = "br.gov.ce.seduc.wsmodelo.dao.mappers.oracle";
	
}
