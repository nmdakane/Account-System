package com.lelo.services.config;

<<<<<<< HEAD
import com.lelo.businessLogic.Configuration.ConfigurationBusinessLogic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfigurationBusinessLogic.class})
=======
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
@Configuration
@ComponentScan(basePackages = "com.lelo.services.controllers")
public class webconfig {
}
