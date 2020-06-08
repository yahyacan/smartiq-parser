package com.vis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yahya
 */
@SpringBootApplication
@EnableEurekaClient
public class ArabamcomParserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArabamcomParserApplication.class,args);
    }

}
