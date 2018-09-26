/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.eureka.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lyn0801
 */
@FeignClient (value = "eureka-client",configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @RequestMapping(value="/hi", method=RequestMethod.GET)
    String sayHiFromClientEureka(@RequestParam(value="name") String name) ;
}
