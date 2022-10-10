package com.techno.javabasics4.exception;

import java.util.Scanner;

public class VoteMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your age :");
		int age = scanner.nextInt();
		Vote vote = new Vote();
		try {
			vote.check(age);
		} catch (CheckedException e) {
			System.out.println(e.getMessage());
		}

	}
}
