package com.ha.oops;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("Loki","loki@gmail.com");
		Student st2=new Student("Thor","loki@gmail.com");
		Student st3=new Student("John","loki@gmail.com");
		
		st1.setStudentPercentage(91.9);
		
		System.out.println(st1.getStudentPercentage());
		
		
		System.out.println(st1.getStudentMailId());
	}

}
