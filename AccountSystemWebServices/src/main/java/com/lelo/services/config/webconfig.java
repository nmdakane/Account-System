package com.lelo.services.config;

import com.lelo.businessLogic.Configuration.ConfigurationBusinessLogic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfigurationBusinessLogic.class})
@Configuration
@ComponentScan(basePackages = "com.lelo.services.controllers")
public class webconfig {
}
