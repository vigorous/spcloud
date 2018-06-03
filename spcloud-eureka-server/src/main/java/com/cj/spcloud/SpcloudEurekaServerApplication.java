package com.cj.spcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpcloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpcloudEurekaServerApplication.class, args);
    }
}
