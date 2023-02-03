package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("com.basic.*")
//@ComponentScan(basePackages = { "com.basic.*" })
//@EntityScan("com.basic.*")   
@SpringBootApplication
public class BasicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicServiceApplication.class, args);
	}

}
