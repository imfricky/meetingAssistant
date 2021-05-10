package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class CalenderAsstApplication extends SpringBootServletInitializer {
	@Override
    	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        	return application.sources(HelloWorldApplication.class);
    }
	@PostConstruct
	public void init(){
		// Setting Spring Boot SetTimeZone

		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}
	public static void main(String[] args) {
		SpringApplication.run(CalenderAsstApplication.class, args);
	}
	@RequestMapping("/")
    	String helloWorld() {
        	return "Hello World!";
    }
}
