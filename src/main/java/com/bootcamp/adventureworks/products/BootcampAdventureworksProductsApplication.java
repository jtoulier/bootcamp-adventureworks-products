package com.bootcamp.adventureworks.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BootcampAdventureworksProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootcampAdventureworksProductsApplication.class, args);
	}

}
