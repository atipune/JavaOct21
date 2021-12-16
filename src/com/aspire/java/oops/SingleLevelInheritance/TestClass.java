package com.aspire.java.oops.SingleLevelInheritance;

public class TestClass 
{
	public static void main(String[] args) 
	{
	System.out.println("Parent properties");
	Parent p = new Parent();
	p.bunglow();
	p.car();
	p.farm();
	p.money();
	
	System.out.println("Child properties");
	Child c= new Child();
	c.iphone();
	c.bike();
	c.bunglow();
	c.car();
	c.farm();
	c.money();
	
		
	}
}
