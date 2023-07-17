package com.nico.store.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"com.nico.store.store.*"})

@EnableCaching
public class StoreApplication  {	

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

}
