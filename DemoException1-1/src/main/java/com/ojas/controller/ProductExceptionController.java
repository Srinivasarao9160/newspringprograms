package com.ojas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ojas.exception.ProductException;

@ControllerAdvice
public class ProductExceptionController {
   @ExceptionHandler(value = ProductException.class)
   public ResponseEntity<Object> exception(ProductException exception) {
      return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
   }
}
