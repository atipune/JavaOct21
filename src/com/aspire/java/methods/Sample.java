package com.aspire.java.methods;

public class Sample 
{
	int x=1000;
	
	public static void main(String[] args) //main-task, purpose-To execute program
	{ 
		System.out.println("I am from Main Method body");
		addition();
		subtraction();
		
	}
	public static void addition()		//task-addition
	{
		
		int a=10;
		a=15;
		a=25;
		a=1000;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
		System.out.println("I am from Addition method body");
	}
	public static void subtraction()
	{
		int i=25;
		System.out.println(i);
		int j=35;
		int k;
		k=j-i;
		System.out.println(k);
		System.out.println("I am from subtraction method body");
	}
	
}
