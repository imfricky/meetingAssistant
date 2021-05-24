package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.TimeZone;


@SpringBootApplication
public class CalenderAsstApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CalenderAsstApplication.class);
	}
	@PostConstruct
	public void init(){
		// Setting Spring Boot SetTimeZone

		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}
	public static void main(String[] args) {
		SpringApplication.run(CalenderAsstApplication.class, args);
	}


}
