//package com.example.gatewaydemooo.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @Author HFwas
// * @Date 2022/1/19 14:39
// */
//@Configuration
//public class RouteConfig {
//
//    @Bean
//    public RouteLocator routeLocator1(RouteLocatorBuilder routeLocatorBuilder){
//        return routeLocatorBuilder.routes()
//                .route("demo-microservice", r -> r.path("/dashboard")
//                        .filters()
//                        .uri("http://localhost:8082"))
//                .build();
//    }
//
//    @Bean
//    public RouteLocator routeLocator2(RouteLocatorBuilder routeLocatorBuilder){
//        return routeLocatorBuilder.routes()
//                .route("demo-support", r -> r.path("/demo-support/**")
//                        .uri("http://localhost:8081"))
//                .build();
//    }
//
//}
