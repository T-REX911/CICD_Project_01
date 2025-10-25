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
@EnableScheduling	
public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}

	@GetMapping("/{name}")
	public ResponseEntity<?> testApi(@PathVariable String name){

				// 1. Get the first character and convert it to uppercase.
		String firstLetter = name.substring(0, 1).toUpperCase();
		
		// 2. Get the rest of the word (from the second character onwards).
		String restOfWord = name.substring(1);
		
		// 3. Combine them to get the capitalized word.
		String capitalizedWord = firstLetter + restOfWord;
		
		String txt = "Testing API : " + capitalizedWord + " GET Method Successful...!";
		
		log.info(txt);
		
		return new ResponseEntity<>(txt, HttpStatus.OK);
	}

	@Scheduled(fixedDelay = 60000) 
    public void reportFixedDelayTask() {
        System.out.println("The project is running at " + dateFormat.format(new Date()));
    }

}
