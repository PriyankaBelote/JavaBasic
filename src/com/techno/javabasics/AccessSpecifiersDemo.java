package com.techno.javabasics;

public class AccessSpecifiersDemo {
	public void publicModifier() {
		System.out.println("public method AccessSpecifiersDemo class");
	}

	private void privateModifier() {
		System.out.println("private method AccessSpecifiersDemo class");
	}

	protected void protectedModifier1() {
		System.out.println("protected method AccessSpecifiersDemo class");
	}

	void defaultModifier() {
		System.out.println("default method AccessSpecifiersDemo class");
	}
	
	public static void main(String[] args) {
		AccessSpecifiersDemo accessSpecifiersDemo=new AccessSpecifiersDemo();
		accessSpecifiersDemo.publicModifier();
		accessSpecifiersDemo.privateModifier();
		accessSpecifiersDemo.protectedModifier1();
		accessSpecifiersDemo.defaultModifier();
	}

}
