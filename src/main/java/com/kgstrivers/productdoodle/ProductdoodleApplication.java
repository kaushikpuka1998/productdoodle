package com.kgstrivers.productdoodle;

import lombok.EqualsAndHashCode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class ProductdoodleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductdoodleApplication.class, args);
	}


}
