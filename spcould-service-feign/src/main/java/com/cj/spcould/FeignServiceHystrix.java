package com.cj.spcould;

import org.springframework.stereotype.Component;

/**
 * 熔断器Hystrix实现
 *
 * @author <a href="mailto:cjun@zjport.gov.cn">cjun</a>
 * @version $Id$
 * @since 1.0
 */
@Component
public class FeignServiceHystrix implements FeignService {
    /**
     * sayHi
     *
     * @param name 姓名
     * @return String
     */
    @Override
    public String sayHi(String name) {
        return "sayHi method --> sorry " + name;
    }

    /**
     * sayHello
     *
     * @param name 姓名
     * @return String
     */
    @Override
    public String sayHello(String name) {
        return "sayHello method --> sorry " + name;
    }
}
