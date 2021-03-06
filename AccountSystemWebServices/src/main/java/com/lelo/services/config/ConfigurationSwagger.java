package com.lelo.services.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
<<<<<<< HEAD
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
=======
<<<<<<< HEAD
//import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
=======
>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2

import java.util.Collections;

@Configuration
@EnableSwagger2
@Import(springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration.class)
public class ConfigurationSwagger {
    @Value("${swagger.application.version}")
    private String applicationVersion;

    @Value("${swagger.application.name}")
    private String applicationName;

    @Value("${swagger.application.description}")
    private String applicationDescription;

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(InfoforApi());
    }

    private ApiInfo InfoforApi() {
        return new ApiInfo(
                applicationName,
                applicationDescription,
                applicationVersion,
                "",
<<<<<<< HEAD
                new Contact("Nompumelelo", "lelo", "lelolee.mdakane18@gmail.com"),
=======
<<<<<<< HEAD
                new Contact("Your Name or Team Name", "", "lelo"),
=======
                new Contact("Your Name or Team Name", "", "email address"),
>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
                "",
                "",
                Collections.emptyList());
    }
}
