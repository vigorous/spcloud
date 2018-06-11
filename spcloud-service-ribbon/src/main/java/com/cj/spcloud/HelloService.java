package com.cj.spcloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * HelloService服务
 */
@Service
public class HelloService {

    /** RestTemplate */
    @Autowired
    RestTemplate restTemplate;

    /**
     * hiService方法:通过http方式访问
     *
     * @param name 名称
     * @return String
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SPCLOUD-EUREKA-CLIENT/hi?name=" + name, String.class);
    }

    /**
     * hiError方法
     *
     * @param name 姓名
     * @return String
     */
    public String hiError(String name) {
        return "hi" + name + ",sorry error!";
    }
}
