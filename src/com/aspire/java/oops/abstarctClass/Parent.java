package com.aspire.java.oops.abstarctClass;

//abstarct class	--> having 0 to 100%

abstract public class Parent 
{
	//Complete method=Declaration+Defination
	//abstract method=Declaration
	public void OpenBrowser()	//Declaration
	{						//Defination
		System.out.println("Chrome browser open");
	}
	abstract public void enterUrl();
	abstract public void clickSignInbtn();
	abstract public void enterUN();
	abstract public void enterpwd();
	abstract public void shopAnItem();
	abstract public void Logout();
}
