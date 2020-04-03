package com.wry.spingcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 日志级别
 * NONE：默认的，不显示任何日志
 * BASIC：仅记录请求方法、URL、响应状态码及执行时间
 * HEADERS：除了 BASIC 中定义的信息之外，还有请求和响应的头信息
 * FULL：除了 HEADERS 中定义的信息之外，还有请求和响应的正文及元数据
 * @author wry
 */
@Configuration
public class OpenFeignConfiguration {
    @Bean
    Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }
}
