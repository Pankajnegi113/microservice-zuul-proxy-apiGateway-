package com.java.eureka.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartRestController {

    @GetMapping("/info")
    public String getServiceInfo(){
        return "This is Cart Service";
    }

    @GetMapping("/getData")
    public String getCartProducts() {
        return "Returning products from CART-SERVICE";
    }
}