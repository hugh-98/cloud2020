package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hugh
 * @create 2022-05-02 19:09
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        // https://news.baidu.com/guonei
        return routeLocatorBuilder.routes()
                .route("path_route_atguigu", r -> r.path("/guonei")
                        .uri("https://news.baidu.com")).build();
    }
}
