package com.lyn0801.gateway.sevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewaySeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaySeviceApplication.class, args);
	}
}
