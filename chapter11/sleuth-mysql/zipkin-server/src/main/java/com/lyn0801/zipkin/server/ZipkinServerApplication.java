package com.lyn0801.zipkin.server;

import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import zipkin.server.EnableZipkinServer;
import zipkin.storage.mysql.MySQLStorage;

@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
        
        @Bean
        public MySQLStorage mySQLStorage(DataSource dataSource){
            return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
        }

}
