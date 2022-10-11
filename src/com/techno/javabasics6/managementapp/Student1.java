package com.techno.javabasics6.managementapp;

public class Student1 {
	int studentId;
	String studentName;
	String studentDept;
	int studentAge;
	Float studentMarks;
	
	public Student1(int studentId, String studentName, String studentDept, int studentAge, float studentMarks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}
	
	

	@Override
	public String toString() {
		return "[studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentAge=" + studentAge + ", studentMarks=" + studentMarks + "]";
	}



	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getStudentDept() {
		return studentDept;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public Float getStudentMarks() {
		return studentMarks;
	}
	
}
