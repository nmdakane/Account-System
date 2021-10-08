package com.lelo.repo.configuration;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories("com.lelo.repo.files")
@EntityScan("com.lelo.webdomain.persistence")
@PropertySource(value = "classpath:applicationRepo.properties")
public class ConfigurationRepository {
}
