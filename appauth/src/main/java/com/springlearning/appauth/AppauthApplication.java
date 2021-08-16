package com.springlearning.appauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppauthApplication.class, args);
	}
	
    @Bean(name = "hello")
    public void myBean() throws Exception
    {
        throw new Exception("Something happened");
    }

}
