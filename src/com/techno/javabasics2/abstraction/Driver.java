package com.techno.javabasics2.abstraction;

public class Driver {
	public void drive(Car car) {
		car.acc();
		car.brake();
		car.gear();
	}
}