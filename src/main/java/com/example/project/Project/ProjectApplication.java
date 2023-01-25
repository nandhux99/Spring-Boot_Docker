package com.example.project.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@CrossOrigin(origins = "http://localhost:8080")
public class ProjectApplication   {

    
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
   
