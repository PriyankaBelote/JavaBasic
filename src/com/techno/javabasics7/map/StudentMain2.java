package com.techno.javabasics7.map;

import java.util.ArrayList;

public class StudentMain2 {
public static void main(String[] args) {
	Student2 student1=new Student2(10,"ravina","electrical",20);
	Student2 student2=new Student2(11, "sai","civil", 22);
	Student2 student3 =new Student2(12,"priya","mechanical", 25);
	Student2 student4=new Student2(13, "sa","civil", 23);
	Student2 student5 =new Student2(14,"priyanka","mechanical", 30);
	
	ArrayList arrayList=new ArrayList();
	
	Student2[] student= {student1,student2,student3,student4,student5};
	 for (int i = 0; i < student.length; i++) {
		 if (student[i].getStudentName().length()>=4) {
			arrayList.add(student[i]);
			System.out.println(student[i]);
		}
	}
	 
}
}
