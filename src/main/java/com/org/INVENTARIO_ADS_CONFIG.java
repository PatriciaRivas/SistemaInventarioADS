package com.org;

import javax.sql.DataSource;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		entityManagerFactoryRef = "inventarioEntityManager",
		transactionManagerRef = "inventarioTransactionManager",
		basePackages = "com.org.inventario.dao")
public class INVENTARIO_ADS_CONFIG {

    @Bean(name = "inventarioDS")
    @ConfigurationProperties("inventario.datasource")
    DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

    @Bean(name = "inventarioEntityManager")
    LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, @Qualifier("inventarioDS") DataSource dataSource) {
		return builder
				.dataSource(dataSource)
				.packages("com.org.inventario.entity")
				.persistenceUnit("inventario")
				.build();
	}

    @Bean(name="inventarioTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("inventarioEntityManager") EntityManagerFactory entityManagerFactory) {
    	return new JpaTransactionManager(entityManagerFactory);
    }
}
