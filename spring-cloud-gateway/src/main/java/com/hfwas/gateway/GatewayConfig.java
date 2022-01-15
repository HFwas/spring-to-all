package com.hfwas.gateway;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName GatewayConfig
 * @Description
 * @Author hfwas
 * @Date:2021/10/19 11:00 下午
 * @Version: 1.0
 **/
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route("path_route2", r -> r.path("/user/getByUsername")
                .uri("http://localhost:8201/user/getByUsername"))
                .build();
    }
}
