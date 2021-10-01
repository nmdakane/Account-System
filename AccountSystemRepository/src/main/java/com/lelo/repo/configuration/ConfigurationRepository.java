package com.lelo.repo.configuration;


<<<<<<< HEAD
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
=======
import org.springframework.context.annotation.Configuration;

@Configuration
>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
public class ConfigurationRepository {
}
