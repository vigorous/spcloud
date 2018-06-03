package com.cj.spcloud;

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
     * hiService方法
     *
     * @param name 名称
     * @return String
     */
    public String hiService(String name) {
        return restTemplate.getForObject("http://SPCLOUD-EUREKA-CLIENT/hi?name=" + name, String.class);
    }
}
