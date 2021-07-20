package com.ojas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoLogger3Application {
	
	
	 Logger log = LoggerFactory.getLogger(DemoLogger3Application.class);

	@GetMapping("/test/{name}")
	public String greeting(@PathVariable String name) {
		log.info(name);
		log.debug("Request {}", name);
		String responce = "haiii" +name+ "Welcome to ojas";
		log.debug("Responce {}", responce);
		return responce;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoLogger3Application.class, args);
	}

}
