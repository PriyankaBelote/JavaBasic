package com.techno.javabasics4.exception;

public class InsufficientException extends RuntimeException {
	private String msg;

	public InsufficientException(String msg) {
		this.msg=msg;
	}
	 
	@Override
	public String getMessage() {
	
		return msg;
	}

}
