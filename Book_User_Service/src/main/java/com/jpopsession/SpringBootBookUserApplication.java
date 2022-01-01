package com.jpopsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@EnableConfigServer
public class SpringBootBookUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBookUserApplication.class, args);
    }
}