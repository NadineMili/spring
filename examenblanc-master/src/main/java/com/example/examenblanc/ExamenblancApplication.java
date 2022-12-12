package com.example.examenblanc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy
@SpringBootApplication
public class ExamenblancApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenblancApplication.class, args);
	}

}
