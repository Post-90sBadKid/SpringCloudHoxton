package com.wry.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wry
 */
@Configuration
public class ApplicationContextConfiguration {
    @Bean
    @LoadBalanced  //开启了客户端负载均衡功能
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}
