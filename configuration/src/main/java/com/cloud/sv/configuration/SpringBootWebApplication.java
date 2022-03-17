package com.cloud.sv.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.cloud.sv.controllers", "com.cloud.sv.configuration"})
public class SpringBootWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.cloud.sv.configuration.SpringBootWebApplication.class, args);
    }

}
