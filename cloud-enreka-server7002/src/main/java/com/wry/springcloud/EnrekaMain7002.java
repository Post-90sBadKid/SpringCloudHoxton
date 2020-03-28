package com.wry.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wry
 */
@SpringBootApplication
@EnableEurekaServer
public class EnrekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EnrekaMain7002.class, args);
    }
}
