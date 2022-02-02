package com.ha.groups;
import com.ha.base.Person;
public class Professors  extends Person{
	private int professorId;
	private String Department;
	private static int count=1000;
	public Professors() {
		this.professorId=count+1;
		count=count+1;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	public void printProfessorDetails() {
		System.out.println("Professor ID--> "+this.professorId);
		System.out.println("Professor name -->"+this.getName());
		System.out.println("Professor Department-->"+this.getDepartment());
	}
	
}
