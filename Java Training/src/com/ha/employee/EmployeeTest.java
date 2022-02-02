package com.ha.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empId=101;
		emp1.empName="Supp";
		emp1.empSalary=60000.28;
		
		
		emp2.empId=102;
		emp2.empName="Tara";
		emp2.empSalary=15324.236512;
		
		emp3.empId=103;
		emp3.empName="Blue";
		emp3.empSalary=15324.2312;
		
		/*System.out.println(emp1.empId +"-->ID");
		System.out.println(emp1.empName+"--> Name");
		System.out.println(emp1.empSalary+"--> Salary");
		System.out.println(Employee.empCompany+"-->Company");
		
		System.out.println(emp2.empId +"-->ID");
		System.out.println(emp2.empName+"--> Name");
		System.out.println(emp2.empSalary+"--> Salary");
		System.out.println(Employee.empCompany+"-->Company");*/
		
		emp1.printEmployeedetails();
		emp2.printEmployeedetails();
		emp3.printEmployeedetails();
	}

}
