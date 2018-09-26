/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.eureka.feign.client;

import org.springframework.stereotype.Component;

/**
 *
 * @author lyn0801
 */
@Component
public class HiHystrix implements EurekaClientFeign{

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ", sorry error.";
    }
    
}
