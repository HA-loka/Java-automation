package com.ha.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public static String empCompany="HA";
	
	
	//Print employee details
	
	/*public static void printDetails(Employee emp) {
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.empSalary);
		System.out.println(Employee.empCompany);
		System.out.println("---------------------------------");
		
	}*/

	public void printEmployeedetails() {
		System.out.println(this);
		System.out.println(this.empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.empCompany);
		System.out.println("---------------------------------");
		
	}
}
