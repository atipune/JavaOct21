package com.aspire.java.opps.variableTypes;

public class Sample 
{
	int a=20;				//inside class block & outside method block-->Global variables
	String s="ATI PUNE";
	static int i=100;		//static global variable
	
	
	public void addition()
	{
		int b=50;	//inside method block-->Local variables
		int c=a+b+i;	//local variable
		System.out.println(c);
		System.out.println(s);
	}
	public void multi()
	{
		int d=70;		//local variable
		int e=a*d;		//local variable
		System.out.println(e);
		System.out.println(s);
	}
	public static void substraction()
	{
		int j=30;
		int k=i-j;
		System.out.println(k);
	//	System.out.println(s);	//s is non static
	}
}
