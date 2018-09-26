/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.eureka.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lyn0801
 */
@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    
    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
