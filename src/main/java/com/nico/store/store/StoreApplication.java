package com.nico.store.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

import java.util.Collections;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nico.store.store.*"})

@EnableCaching
public class StoreApplication  {	

	public static void main(String[] args) {
//		String port = System.getenv("PORT");
//		if (port == null) {
//			port = "8080"; // Nếu không tìm thấy biến PORT, sử dụng cổng mặc định 8080
//		}
//		SpringApplication app = new SpringApplication(StoreApplication.class);
//		app.setDefaultProperties(Collections.singletonMap("server.port", port));
//		app.run(args);
		SpringApplication.run(StoreApplication.class, args);
	}

}
