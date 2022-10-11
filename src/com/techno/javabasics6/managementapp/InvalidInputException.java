package com.techno.javabasics6.managementapp;

public class InvalidInputException extends Exception {
	String msg;

	public InvalidInputException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}

}
