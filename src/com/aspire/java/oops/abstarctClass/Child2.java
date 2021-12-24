package com.aspire.java.oops.abstarctClass;

//laptop shopping-->Flipkart

public class Child2 extends Parent
{

	public void enterUrl() 
	{
		System.out.println("https://www.flipkart.com/");
	}

	
	public void clickSignInbtn() 
	{
		System.out.println("Click sign in button");
	}

	
	public void enterUN() 
	{
		System.out.println("Enter email id");
		System.out.println("xyz@gmail.com");
	}


	public void enterpwd() {
		System.out.println("Enter password");
		System.out.println("xyz@54648");
		
	}

	
	public void shopAnItem() {
	
		System.out.println("Select a l;optop and add to cart");
		System.out.println("Make payment");
	}


	public void Logout() {
	
		System.out.println("Logout from application");
	}

}
