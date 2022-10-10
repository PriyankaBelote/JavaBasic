package com.techno.javabasics4.exception;

import java.util.Scanner;

public class Vote {

	public void check(int age) throws CheckedException {
		if (age >= 18) {
			System.out.println("eligible for voting");
		} else {
			throw new CheckedException("not eligible for voting");
		}
	}

	
}
