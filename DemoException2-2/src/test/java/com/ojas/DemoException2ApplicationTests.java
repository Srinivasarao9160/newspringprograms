package com.ojas;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ojas.exception.BlogAlreadyExitsException;
import com.ojas.model.Blog;
import com.ojas.service.BlogService;

@SpringBootTest
class DemoException2ApplicationTests {

	@Autowired
	private BlogService blogService;

	@Test
	void contextLoads() {
	}

	
}
