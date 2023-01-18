package com.kgstrivers.productdoodle;

import lombok.EqualsAndHashCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ProductdoodleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdoodleApplication.class, args);
	}

}
