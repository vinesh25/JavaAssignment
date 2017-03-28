package com.shop.shopLocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@ComponentScan(basePackages = "com.shop")
@EnableAutoConfiguration*/
@SpringBootApplication(scanBasePackages={"com.shop"})
public class ShopeeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeServerApplication.class, args);
	}
	
}
