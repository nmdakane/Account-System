package com.lelo.repo.configuration;


<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
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
<<<<<<< HEAD
=======
=======
import org.springframework.context.annotation.Configuration;

@Configuration
>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
public class ConfigurationRepository {
}
