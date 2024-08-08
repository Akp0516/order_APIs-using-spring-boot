package com.akpgrp.tofindserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class Findserverapp {
    public static void main(String[] args) {SpringApplication.run(Findserverapp.class, args);
    }
}
