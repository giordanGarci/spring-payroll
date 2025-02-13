package com.giordan.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringHrWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHrWorkerApplication.class, args);
	}

}
