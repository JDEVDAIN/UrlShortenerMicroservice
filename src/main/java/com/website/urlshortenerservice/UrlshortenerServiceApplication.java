package com.website.urlshortenerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class UrlshortenerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UrlshortenerServiceApplication.class, args);
	}

}
