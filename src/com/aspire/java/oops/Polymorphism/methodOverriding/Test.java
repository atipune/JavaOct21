package com.aspire.java.oops.Polymorphism.methodOverriding;

public class Test 
{
	public static void main(String[] args) 
	{
		System.out.println("********Parent Properties********");
		Parent p= new Parent();
		p.money();
		p.farm();
//		p.bunglow();
		p.car();		//unique
		Parent.Jwellary();
		
		System.out.println("********Child Properties********");
		Child c=new Child();
		c.car();		//Unique from parent class
		c.bike();		//Unique from child class
		c.money();	
		c.farm();
		c.bunglow();
		Child.Jwellary();
		c.addition(10, 12);
	}
}
