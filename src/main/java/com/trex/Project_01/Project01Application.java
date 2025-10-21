package com.trex.Project_01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
@Slf4j
public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}

	@GetMapping("/{name}")
	public ResponseEntity<?> testApi(@PathVariable String name){
		String txt = "Testing API : " + name + " GET Method Successful...!";
		log.info(txt);
		return new ResponseEntity<>(txt, HttpStatus.OK);
	}

}
