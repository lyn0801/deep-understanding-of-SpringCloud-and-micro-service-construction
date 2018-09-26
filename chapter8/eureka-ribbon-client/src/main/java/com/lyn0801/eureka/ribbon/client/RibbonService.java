/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.eureka.ribbon.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author lyn0801
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod="hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }
    
    public String hiError(String name){
        return "hi," + name + ", sorry error.";
    }
}
