package com.ha.runner;

import com.ha.groups.*;

public class Runner {

	public static void main(String[] args) {
		
		
		Student stu1=new Student();
		
		stu1.setName("John wick");
		stu1.setPhoneNumber(8128219921L);
		stu1.setStudentPercentage(66.89);
		//System.out.print(stu1.getName());
		//System.out.println(stu1.getStudentId());
		
		
		stu1.printStudentDetails();
		
		
		Professors p1=new Professors();
		
		p1.setName("Bill");
		p1.setDepartment("ISE");
	}

}
