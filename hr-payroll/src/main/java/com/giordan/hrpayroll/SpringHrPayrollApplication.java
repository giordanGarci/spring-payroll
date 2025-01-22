package com.giordan.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringHrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHrPayrollApplication.class, args);
	}

}
