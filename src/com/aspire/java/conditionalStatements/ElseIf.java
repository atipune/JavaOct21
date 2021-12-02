package com.aspire.java.conditionalStatements;

//if else if

public class ElseIf {
public static void main(String[] args) {
	int marks =10;
	
	
	if(marks>100)
	{
		System.out.println("Please reenter the marks correctly/valid");
	}
	else if(marks>=75)	//80
	{
		System.out.println("Result: Pass with Distinction");
	}
	else if(marks>=60)
	{
		System.out.println("Result : Pass with 1st class");
	}
	else if(marks>=40)
	{
		System.out.println("Result : Pass with 2nd class");
	}
	else
	{
			System.out.println("Result : Fail");
			System.out.println("Try next time");
	}
}
	
}
