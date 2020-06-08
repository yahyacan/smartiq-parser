package com.vis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yahya
 */
@SpringBootApplication
@EnableEurekaServer
public class ParserEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(ParserEurekaServer.class, args);
    }

}
