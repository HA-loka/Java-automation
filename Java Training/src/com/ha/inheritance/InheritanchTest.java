package com.ha.inheritance;



  class Parent{
	  public void parentStyle() {
		  System.out.println("Inside parent class");
	  }
  }


class child extends Parent{
	public void childStyle() {
		System.out.println("Inside child class");
	}
}
public class InheritanchTest {

	public static void main(String[] args) {
		Parent p1=new Parent();
		child c1=new child();
		
		
		p1.parentStyle();
		c1.parentStyle();
		c1.childStyle();
		

	}

}
