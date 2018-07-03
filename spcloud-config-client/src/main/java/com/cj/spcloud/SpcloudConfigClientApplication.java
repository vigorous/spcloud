package com.cj.spcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpcloudConfigClientApplication {

    /**
     * 主方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(SpcloudConfigClientApplication.class, args);
    }

    /**
     * 远程服务器参数
     */
    @Value("${foo}")
    String foo;

    /**
     * 获取远程服务器参数
     *
     * @return String
     */
    @RequestMapping(value = "/getRemoteFooParam")
    public String getRemoteFooParam() {
        return foo;
    }


}
