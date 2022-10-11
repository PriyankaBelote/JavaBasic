package com.techno.javabasics5.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentMain {
public static void main(String[] args) {
	Student student=new Student(10,"Raj","aurangabad");
	Student student1=new Student(5,"sonali","kolhapur");
	Student student2=new Student(7,"shivani","pune");
	
	ArrayList<Student> arrayList=new ArrayList<>();
	arrayList.add(student);
	arrayList.add(student1);
	arrayList.add(student2);
	System.out.println(arrayList);
	
	
	System.out.println("----before sorting---");
	for (Student student3 : arrayList) {
		System.out.println(student3);
	}
	
	System.out.println("----after sorting---");
     Collections.sort(arrayList);
     for (Student student4 : arrayList) {
 		System.out.println(student4);
 	}
     
     System.out.println("----after sorting_id using comparator---");
     Collections.sort(arrayList,new SortById());
     for (Student student5 : arrayList) {
  		System.out.println(student5);
  	}
     
     System.out.println("--------after sorting_name using comparator-------");
     Collections.sort(arrayList,new SortByName());
     for (Student student6 : arrayList) {
  		System.out.println(student6);
  	}
}
}
