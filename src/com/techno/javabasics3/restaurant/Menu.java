package com.techno.javabasics3.restaurant;

import java.util.Scanner;

public class Menu {
	public static MainMenu getMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select any item");
		String[] string = { "1.samosa-Rs12/pcs", "2.pakoda-Rs20/pcs", "3.maggie-Rs25/pcs", "4.vadapav-Rs10/pcs" };

		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);
		}
		System.out.println("enter your item no.");
		int itemNo = scanner.nextInt();

		System.out.println("enter quantity");
		int quantity = scanner.nextInt();
		System.out.println("you selected : " + quantity + " items");

		System.out.println("want to order anything else??");
		String[] string1 = { "1.YES", "2.NO" };

		for (int j = 0; j < string1.length; j++) {
			System.out.println(string1[j]);
		}

		System.out.println("enter your choice ");
		int ans = scanner.nextInt();
		int itemNo1 = 0;
		int quantity1 = 0;
		int sum = 0;
		int bill = Total.orderTotal(itemNo, quantity);
		if (ans == 1) {
			System.out.println("enter your item no.");
			itemNo1 = scanner.nextInt();

			System.out.println("enter quantity");

			quantity1 = scanner.nextInt();
			int quantityTotal = quantity + quantity1;
			System.out.println("you selected : " + quantityTotal + " items");
		}

		scanner.close();
		
		 bill = bill+Total.orderTotal(itemNo1, quantity1);
		
	
		System.out.println("your bill is Rs: " + bill);
		System.out.println("please wait till your order gets ready..!!");

		return null;

	}

}
