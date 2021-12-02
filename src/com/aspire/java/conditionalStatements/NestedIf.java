package com.aspire.java.conditionalStatements;

//Legal voter

public class NestedIf 
{
	public static void main(String[] args) 
	{
		int age=40;
		String gender="Male";
	if(age>=18)
	{
		System.out.println("The person is a legal voter");
		if(gender=="Male"&&age<21)
		{
			System.out.println("The person dont have valid age for marriage");
			if(age<30)
			{
				System.out.println("Eligible to apply Govt. Jobs");
			}
			else
			{
				System.out.println("Not eligible to apply Govt. Jobs");
			}

		}
		else 
		{
			System.out.println("Valid age for marriage");
		}
		
	}
	else 
	{
		System.out.println("Not a legal voter");
	}
	}
}
