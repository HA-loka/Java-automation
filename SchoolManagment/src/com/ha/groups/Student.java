package com.ha.groups;
 import com.ha.base.Person;
public class Student extends Person{
	
	private static int count=100;
	private int studentId;
	private double studentPercentage;
	private String courseCode;
	
	public Student(){
		this.studentId=count+1;
		count=count+1;
	}
	
	

	
	public int getStudentId() {
		return studentId;
	}




	public double getStudentPercentage() {
		return studentPercentage;
	}




	public void setStudentPercentage(double studentPercentage) {
		if(studentPercentage>=0 && studentPercentage<=100) {
		this.studentPercentage = studentPercentage;}
		else
			System.out.println("Invalid Percentage");
	}
	
	public void printStudentDetails() {
		System.out.println("Student ID-->"+this.getStudentId());
		System.out.println("Studennt Name-->"+this.getName());
		System.out.println("Student Phone Number-->"+this.getPhoneNumber());
		System.out.println("Student Percentage-->"+this.getStudentPercentage());
	}
	
}


/*Student 1 
 * John wick --> "Name"
 * 8219812812-->"Phone"
 * john@gmail.com--> "mailid"
 * #243, NYC --> "Address"
 * Nyc HIgh --> "school name"
 * #2, NYC High, NYC  --> school address*/