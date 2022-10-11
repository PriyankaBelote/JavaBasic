package com.techno.javabasics5.collection;

import java.util.Comparator;

public class SortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getRollNo()-o2.getRollNo();
	}

}