package com.cj.spcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author cj
 */
@SpringBootApplication
@EnableConfigServer
public class SpcloudConfigServerApplication {

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SpcloudConfigServerApplication.class, args);
    }
}
