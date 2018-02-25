package com.lazokin.quotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@SpringBootApplication
public class QuotesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesAppApplication.class, args);
	}
	
	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
}
