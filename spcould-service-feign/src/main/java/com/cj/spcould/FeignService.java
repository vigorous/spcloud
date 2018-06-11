package com.cj.spcould;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * feignService
 *
 * @author <a href="mailto:cjun@zjport.gov.cn">cjun</a>
 * @version $Id$
 * @since 1.0
 */
@FeignClient(value = "spcloud-eureka-client", fallback = FeignServiceHystrix.class)
public interface FeignService {
    /**
     * sayHi
     *
     * @param name 姓名
     * @return String
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);

    /**
     * sayHello
     *
     * @param name 姓名
     * @return String
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);
}
