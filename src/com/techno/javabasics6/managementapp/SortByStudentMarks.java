package com.techno.javabasics6.managementapp;

import java.util.Comparator;

public class SortByStudentMarks implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.getStudentMarks().compareTo(o2.getStudentMarks());
	}

}
