package com.akpgrp.inventoryapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryapiApplication.class, args);
	}

}
