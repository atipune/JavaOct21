package com.aspire.java.oops.casting.nonPrimitive;

public class Test 
{
	public static void main(String[] args) {
		System.out.println("***********Parent class object**************");
		Parent p= new Parent();
		p.house();
		p.money();
		p.jwellary();
		
		System.out.println("***********Child class object*****************");
		Child c= new Child();
		c.house();
		c.money();
		c.bike();
		
		System.out.println("***********Casting*****************");
		Parent pc= new Child();	//Child class object and refer Parent class name
		pc.house();	//latest implementation from child class
		pc.money();
		pc.jwellary();
	//	pc.bike();		//unique properties from child class are not provided to parent class
	}
}
