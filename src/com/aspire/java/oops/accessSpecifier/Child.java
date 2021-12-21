package com.aspire.java.oops.accessSpecifier;

//Same package - child class

public class Child extends Parent
{
	public void m5() 
	{
		System.out.println("Public method from Child class");
	}
	protected void m6() {
		System.out.println("Protected method from Child class");
	}
	void m7() 
	{
		System.out.println("Default method from child class");
	}
	private void m8() 	
	{
		System.out.println("Private method from Child class"); 
	}
	
	
	public static void main(String[] args) 
	{
		Child c= new Child();
		c.m1();
		c.m2();
		c.m3();	//m4() can not be called in child class
		c.m5();
		c.m6();
		c.m7();
		c.m8();
		
		Parent p= new Parent();
		p.m1();
		p.m2();
		p.m3();
		
		Sample s= new Sample();
		s.m9();
		s.m10();
		s.m11();
		
	}
	
	
}
