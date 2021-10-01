package com.lelo.businessLogic.Configuration;


import com.lelo.translator.Configuration.ConfigurationTranslator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfigurationTranslator.class})
@Configuration
@ComponentScan(basePackages = "com.lelo.businessLogic.Flows")
public class ConfigurationBusinessLogic {
}
