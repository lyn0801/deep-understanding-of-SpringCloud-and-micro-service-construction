/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.eureka.feign.client;

import feign.Retryer;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author lyn0801
 */
@Configuration
public class FeignConfig {
    public Retryer feignRetryer () {
        return new Retryer.Default(100, SECONDS.toMillis(1), 5) ;
    }
}
