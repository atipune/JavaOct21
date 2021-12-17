package com.aspire.java.oops.restInheretance;

public class TestHirarchicalInheritance 
{
	public static void main(String[] args) 
	{
		System.out.println("*****************Purchase Mobile from flipkart***************");
		Child1 c1=new Child1();
		c1.openBrowser();		//parent
		c1.openFlikart();		//parent
		c1.enterCredentials();	//parent
		c1.mobileShopping();			//child1
		c1.payment();			//parent
		
		System.out.println("***********Purchase Laptop from flipkart***************");
		Child2 c2=new Child2();
		c2.openBrowser();
		c2.openFlikart();
		c2.enterCredentials();
		c2.laptopShopping();
		c2.payment();
		
		System.out.println("****************Purchase DSLR Camera from flipkart**************");
		Child3 c3=new Child3();
		c3.openBrowser();
		c3.openFlikart();
		c3.enterCredentials();
		c3.DSLRCameraShopping();
		c3.payment();
	
	}
}
