package com.aspire.java.constructor;

public class Sample 
{

	int a;
	float b;
	char c;
	String d;
	boolean e;
	
	public static void main(String[] args) 
	{
		Sample object =new Sample();
		//className objectName = new Constructor
		//constructorName=className()
	//	System.out.println(object.a);	//1st print
		object.method1();				//2nd print
		
	}
	public void method1()
	{
	//  e=true;
	//	a=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
}
