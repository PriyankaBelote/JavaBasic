package com.techno.javabasics5.collection;

import java.util.Iterator;

public class MyArrayListMain {
 
	public static void main(String[] args) {
		MyArrayList myArrayList=new MyArrayList(5);
		myArrayList.add(2);
		myArrayList.add(2);
		myArrayList.add(2);
		myArrayList.add(2);
		myArrayList.add(2);
		myArrayList.add(2);
		System.out.println(myArrayList);
		
		
		//for loop
//		for (int i = 0; i < myArrayList.size(); i++) {
//			System.out.println(myArrayList.get(i));
//		}
		
		//for -each loop
//		for (Object obj :myArrayList) {
//			System.out.println(obj);
//		}
		
		//iterator
		Iterator iterator = myArrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
