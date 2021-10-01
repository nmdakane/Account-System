package com.lelo.translator.Configuration;


import com.lelo.repo.configuration.ConfigurationRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfigurationRepository.class})
@Configuration
@ComponentScan(basePackages = "com.lelo.translator")
public class ConfigurationTranslator {
}
