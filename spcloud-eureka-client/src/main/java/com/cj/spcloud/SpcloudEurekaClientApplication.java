package com.cj.spcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务者
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class SpcloudEurekaClientApplication {

    /** 服务端口 */
    @Value("${server.port}")
    private String port;

    /**
     * hi方法
     *
     * @param name 姓名
     * @return String
     */
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ", i am from port:" + port;
    }

    /**
     * hello方法
     *
     * @param name 姓名
     * @return String
     */
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + ", i am from port:" + port;
    }

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SpcloudEurekaClientApplication.class, args);
    }

}
