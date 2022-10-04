package com.java.eureka.apiGateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    //Static Routing
    //If a microservice has a single instance(also known as a direct call to
    // microservice) is known as static routing. In this case API Gateway routes
    // the request directly to the microservice.

    //Dynamic Routing
    //API Gateway reaches Eureka, to get less load factor instance and then routes
    // the request to the corresponding microservice. It internally generates Feign
    // Client code based on the given configuration for load balancing.



    @Bean
    public RouteLocator configureRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("paymentId", r->r.path("/payment/**").uri("http://localhost:8091")) //static routing
                .route("cartId", r->r.path("/cart/**").uri("lb://CART-SERVICE")) //dynamic routing
                .build();
    }
}
