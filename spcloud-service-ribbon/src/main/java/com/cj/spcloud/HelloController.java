package com.cj.spcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 */
@RestController
public class HelloController {

    /** helloService服务 */
    @Autowired
    HelloService helloService;

    /**
     * hi方法
     *
     * @param name 名称
     * @return String
     */
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    /**
     * hello方法
     *
     * @param name 名称
     * @return String
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
