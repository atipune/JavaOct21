package com.aspire.java.opps.variableTypes;

public class Test 
{
	public static void main(String[] args) 
	{
		Sample object=new Sample();
		//variable call
		System.out.println(object.a);
		System.out.println(object.s);
		System.out.println(Sample.i);
		
		
		//Method call
		object.addition();
		object.multi();
		Sample.substraction();
		
		
	}
}
