package com.wry.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Ribbon 配置类
 * 不能放在 @ComponentScan 所扫描的当前包下以及子包下，
 * 否则自定义的配置类就会被所有的 Ribbon 客户端所共享，达不到特殊化定制的目的了
 *
 * @author wry
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule getRule() {
        return new RandomRule();
    }
}
