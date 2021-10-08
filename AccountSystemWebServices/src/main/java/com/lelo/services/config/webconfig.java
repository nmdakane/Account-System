package com.lelo.services.config;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
import com.lelo.businessLogic.Configuration.ConfigurationBusinessLogic;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({ConfigurationBusinessLogic.class})
<<<<<<< HEAD
=======
=======
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

>>>>>>> b199b69d691679bba8a1301f838ff6153a986d3c
>>>>>>> e742888ae3999fa90cca9d489362b4caa12665e2
@Configuration
@ComponentScan(basePackages = "com.lelo.services.controllers")
public class webconfig {
}
