package com.techno.javabasics5.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayIterationWays {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		System.out.println("----for each------");
		for (Object obj : arrayList) {
			System.out.println(obj);
		}

		System.out.println("----iterator------");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		System.out.println("-----listforward-----");
		ListIterator listIterator = arrayList.listIterator();
		{
			while (listIterator.hasNext()) {
				System.out.println(listIterator.next());

			}
		}
		System.out.println("----listprevious------");
		ListIterator listIterator1 = arrayList.listIterator();
		{
			while (listIterator.hasPrevious()) {
				System.out.println(listIterator.previous());

			}
		}

		System.out.println("-----for loop-----");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));

		}

	}
}
