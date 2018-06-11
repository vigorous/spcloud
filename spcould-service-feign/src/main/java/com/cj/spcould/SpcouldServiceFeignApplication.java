package com.cj.spcould;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients////打开Feign注解
//@EnableCircuitBreaker//打开Hystrix断路器
//@ServletComponentScan//扫描缓存
public class SpcouldServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpcouldServiceFeignApplication.class, args);
    }
}
