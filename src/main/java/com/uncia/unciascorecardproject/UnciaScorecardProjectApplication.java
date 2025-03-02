package com.uncia.unciascorecardproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration.class })
public class UnciaScorecardProjectApplication {
	private static final Logger log = LoggerFactory.getLogger(UnciaScorecardProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UnciaScorecardProjectApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
