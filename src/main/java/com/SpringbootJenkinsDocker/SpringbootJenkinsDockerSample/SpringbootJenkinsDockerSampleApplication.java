package com.SpringbootJenkinsDocker.SpringbootJenkinsDockerSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootJenkinsDockerSampleApplication {

	
	@GetMapping("/get")
	public String getMessage() {
		return "Hello Avinash Welcome";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinsDockerSampleApplication.class, args);
	}

}
