package com.techno.javabasics4.exception;

public class CheckedException extends Exception {
	private String msg;

	public CheckedException(String msg) {
		this.msg = msg;
	}
    @Override
    public String getMessage() {
    	// TODO Auto-generated method stub
    	return msg;
    }
}
