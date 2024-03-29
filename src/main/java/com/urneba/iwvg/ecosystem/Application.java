package com.urneba.iwvg.ecosystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})// Not: /error
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); // mvn clean spring-boot:run
    }

}
