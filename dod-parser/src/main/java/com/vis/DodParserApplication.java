package com.vis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yahya
 */
@SpringBootApplication
@EnableEurekaClient
public class DodParserApplication {

    public static void main(String[] args) {

        SpringApplication.run(DodParserApplication.class,args);
        
    }
    
}