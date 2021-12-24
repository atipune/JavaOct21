package com.aspire.java.oops.abstarctClass;

//mobile shopping-->Amazon

public class Child1 extends Parent
{

	public void enterUrl() 
	{
		System.out.println("https://www.amazon.in/");
	}
	
	public void clickSignInbtn() 
	{
		System.out.println("Clink on Signin button");
	}

	
	public void enterUN() 
	{
		System.out.println("Enter email id or mobile number");
		System.out.println("abc@gmail.com");
		
	}


	public void enterpwd() 
	{
		System.out.println("Enter password");
		System.out.println("abc@123");
		
	}


	public void shopAnItem() 
	{
		System.out.println("Select mobile and add to cart");
		System.out.println("make payment");
	}


	public void Logout() 
	{
		System.out.println("Click logout button");
		
	}
	

}
