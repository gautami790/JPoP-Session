package com.jpopsession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class SpringBootBookUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBookUserApplication.class, args);
    }
}