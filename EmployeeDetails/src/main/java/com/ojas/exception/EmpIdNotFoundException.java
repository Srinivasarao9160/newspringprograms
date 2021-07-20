package com.ojas.exception;

public class EmpIdNotFoundException extends RuntimeException {
	private String message;

	public EmpIdNotFoundException(String message) {
		super();
		this.message = message;
	}
	

}
