package com.wry.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mi
 */
@Configuration
public class GetWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_news", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"))
                .route("path_route_news_guoji", r -> r.path("/guoji").uri("http://news.baidu.com/guoji"));
        return routes.build();
    }
}
