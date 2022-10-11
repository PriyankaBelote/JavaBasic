package com.techno.javabasics5.collection;

public class Student implements Comparable<Student> {

	int rollNo;
	 String name;
	 String city;

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public Student(int i, String string, String string2) {
		this.rollNo = i;
		this.name = string;
		this.city = string2;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

//	public int compareTo(Student o) {
//		
//		return this.rollNo-o.rollNo;
//	}

//	public int compareTo(Student o) {
//
//		return this.name.compareTo(o.name);
//	}
	
	public int compareTo(Student o) {

		return this.city.compareTo(o.city);
	}

}
