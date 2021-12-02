package com.aspire.java.conditionalStatements;

//Login to system
//username, password

public class NestedIf2 {
	public static void main(String[] args) {
		String UN="Prashant";		// with scanner class input
		String PWD="Prashant@123";	// with scanner class input
		System.out.println("Enter Unsename : ");
		if(UN=="Prashant")
		{
			System.out.println("Username is correct");
			if(PWD=="Prashant@123")
			{
				System.out.println("Password is correct");
				System.out.println("Login to system is successful");
			}
			else 
			{
				System.out.println("Password is incorrect");
			}
		}
		else
		{
			System.out.println("Username is incorrect");
		}
	}
}
