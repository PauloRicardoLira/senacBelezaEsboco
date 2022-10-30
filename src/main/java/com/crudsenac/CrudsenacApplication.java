package com.crudsenac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.crudsenac.controllers"})
public class CrudsenacApplication { 	

	public static void main(String[] args) {
		SpringApplication.run(CrudsenacApplication.class, args);
	}

}