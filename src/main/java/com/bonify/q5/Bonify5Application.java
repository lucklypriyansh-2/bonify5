package com.bonify.q5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan({"com.bonify"})
public class Bonify5Application {

	public static void main(String[] args) {
		SpringApplication.run(Bonify5Application.class, args);
	}

}
