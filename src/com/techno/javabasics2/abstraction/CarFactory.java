package com.techno.javabasics2.abstraction;

import java.util.Scanner;

public class CarFactory {
	public static Car getCar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the car name: ");
		String carName = scanner.next();
		if (carName.equalsIgnoreCase("audi")) {
			return new Audi();
		} else if (carName.equalsIgnoreCase("bmw")) {
			return new Bmw();
		}
		return null;

	}

}
