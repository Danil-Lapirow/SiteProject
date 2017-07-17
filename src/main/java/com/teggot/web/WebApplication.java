package com.teggot.web;

import com.teggot.web.Models.Product;
import com.teggot.web.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication{
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
