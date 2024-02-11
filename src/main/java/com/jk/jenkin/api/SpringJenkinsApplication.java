package com.jk.jenkin.api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started...");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		logger.info("Application executed second time");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
