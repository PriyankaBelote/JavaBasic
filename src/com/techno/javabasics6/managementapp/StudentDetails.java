package com.techno.javabasics6.managementapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.techno.javabasics5.collection.SortById;
import com.techno.javabasics5.collection.Student;

public class StudentDetails {
	public static void getDetails() throws InvalidInputException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n1.Press 1 to sort by id \n2.Press 2 to sort by Name "
				+ "\n3.Press 3 to sort by Dept \n4.Press 4 to sort by Age "
				+ "\n5.Press 5 to sort by Marks \nenter your choice : ");
		int choice = scanner.nextInt();

		Student1 student1 = new Student1(1, "priya", "electrical", 25, 65);
		Student1 student2 = new Student1(2, "kiran", "electronics", 23, 80);
		Student1 student3 = new Student1(3, "sakshi", "computor", 20, 50);
		Student1 student4 = new Student1(4, "sheetal", "civil", 24, 75);
		Student1 student5 = new Student1(5, "pooja", "mechanical", 28, 85);

		Set<Student1> set = new HashSet();
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);

		ArrayList<Student1> arrayList = new ArrayList<Student1>(set);
//		System.out.println(arrayList);

//		for (Student1 student12 : arrayList) {
//			System.out.println(student12);
//		}
            
		
		if (choice<6) {
			switch (choice) {
			case 1:
				Comparator<Student1> comparator=(o1,o2)->{
					return o1.getStudentId()-o2.getStudentId();
				};
				  arrayList.stream().sorted(comparator).collect(Collectors.toList()).forEach(System.out::println);
				
				
				
//				Collections.sort(arrayList, new SortByStudentId());
//				for (Student1 student13 : arrayList) {
//					System.out.println(student13);
//				}
				break;
			case 2:
				Comparator<Student1> comparator1=(o1,o2)->{
					return o1.getStudentId()-o2.getStudentId();
				};
				  arrayList.stream().sorted(comparator1).collect(Collectors.toList()).forEach(System.out::println);
				
//				Collections.sort(arrayList, new SortByStudentName());
//				for (Student1 student14 : arrayList) {
//					System.out.println(student14);
//				}
				break;
			case 3:
				
				Comparator<Student1> comparator2=(o1,o2)->{
					return o1.getStudentId()-o2.getStudentId();
				};
				  arrayList.stream().sorted(comparator2).collect(Collectors.toList()).forEach(System.out::println);
//				Collections.sort(arrayList, new SortByStudentDept());
//				for (Student1 student14 : arrayList) {
//					System.out.println(student14);
//				}
				break;
			case 4:
				
				Comparator<Student1> comparator3=(o1,o2)->{
					return o1.getStudentId()-o2.getStudentId();
				};
				  arrayList.stream().sorted(comparator3).collect(Collectors.toList()).forEach(System.out::println);
//				Collections.sort(arrayList, new SortByStudentAge());
//				for (Student1 student14 : arrayList) {
//					System.out.println(student14);
//				}
				break;
			case 5:
				Comparator<Student1> comparator4=(o1,o2)->{
					return o1.getStudentId()-o2.getStudentId();
				};
				  arrayList.stream().sorted(comparator4).collect(Collectors.toList()).forEach(System.out::println);
//				Collections.sort(arrayList, new SortByStudentMarks());
//				for (Student1 student14 : arrayList) {
//					System.out.println(student14);
//				}
				break;
			default:
				break;
			}
		} else {
                 
			throw new InvalidInputException("Invalid input");
		}
		
		
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println();
		System.out.println("do you want to continue \n1.yes \n2.no");
		int decide = scanner2.nextInt();
		
		if (decide==1) {
			getDetails();
		}else {
			System.out.println("exit");
		}

	}
	
	

}
