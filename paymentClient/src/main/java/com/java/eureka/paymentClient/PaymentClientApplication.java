package com.java.eureka.paymentClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PaymentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentClientApplication.class, args);
	}

}
