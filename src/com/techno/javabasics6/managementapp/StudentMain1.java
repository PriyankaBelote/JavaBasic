package com.techno.javabasics6.managementapp;

import java.util.Scanner;

public class StudentMain1 {
public static void main(String[] args) {
	try {
		StudentDetails.getDetails();
	} catch (InvalidInputException e) {
		System.out.println(e.getMessage());
	}
}
}
