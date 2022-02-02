package com.ha.oops;

public class Student {
	private int studentID;
	private String studentName;
	private String studentMailId;
	private double studentPercentage;
	private static String schoolName;
	static int count=1000;
	
	public Student(String studentName,String studentMailId) {
		studentID=count;
		count+=1;
		this.studentName=studentName;
		this.studentMailId=studentMailId;
	}
	
	public double getStudentPercentage() {
		return this.studentPercentage;
	}
	
	public void setStudentPercentage(double studentPercentage) {
		if(studentPercentage>=0 && studentPercentage<=100) {
			this.studentPercentage=studentPercentage;
		}
		else {
			System.out.println("Invalid percentage");
		}
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentMailId() {
		return studentMailId;
	}

	public void setStudentMailId(String studentMailId) {
		this.studentMailId = studentMailId;
	}

}
