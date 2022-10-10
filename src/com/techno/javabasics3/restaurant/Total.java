package com.techno.javabasics3.restaurant;

public class Total {

	public static int orderTotal(int itemNo, int quantity) {

		int subTotal = 0;
		int subTotal1 = 0;
//		int sub = quantity + quantity1;
//		int itemTotal = itemNo + itemNo1;
//			if (true) {
				if (itemNo == 1) {
					subTotal = quantity * 12;
				} else if (itemNo == 2) {
					subTotal = quantity * 20;
				} else if (itemNo == 3) {
					subTotal = quantity * 25;
				} else if (itemNo == 4) {
					subTotal = quantity * 10;
				}
				return subTotal;
		
	}
}
