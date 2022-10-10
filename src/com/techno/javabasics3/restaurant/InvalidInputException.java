package com.techno.javabasics3.restaurant;

public class InvalidInputException extends Exception {
	String msg;

	public InvalidInputException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {

		return msg;
	}

}
