package com.numbertochar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NumberConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberConverterApplication.class, args);
	}

}
