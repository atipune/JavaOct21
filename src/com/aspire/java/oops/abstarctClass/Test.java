package com.aspire.java.oops.abstarctClass;

public class Test 
{
	public static void main(String[] args) {
		
		System.out.println("Absatrat method from parent implementation by Child1");
		Child1 c1= new Child1();
		c1.OpenBrowser();
		c1.enterUrl();
		c1.enterUN();
		c1.enterpwd();
		c1.clickSignInbtn();
		c1.shopAnItem();
		c1.Logout();
		
		System.out.println("Absatrat method from parent implementation by Child2");
		Child2 c2= new Child2();
		c2.OpenBrowser();
		c2.enterUrl();
		c2.enterUN();
		c2.enterpwd();
		c2.clickSignInbtn();
		c2.shopAnItem();
		c2.Logout();
		
		System.out.println("Absatrat method from parent implementation by Child3");
		//create object for child3 & call respective methods
	}
}
