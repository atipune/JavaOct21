package com.aspire.java.conditionalStatements;

//marks of a student for any subject

public class IfStatement 
{
	public static void main(String[] args) {
		System.out.println("Program starts");
		int marks=39;
		int passingMarks =40;
		
		if(marks<=passingMarks)
		{
			System.out.println("Result: Fail");
		}
		System.out.println("Program ends");
	}
}
