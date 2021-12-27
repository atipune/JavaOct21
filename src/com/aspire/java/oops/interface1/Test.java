package com.aspire.java.oops.interface1;

public class Test 
{
	public static void main(String[] args) 
	{
		//static method call
		Inter_face2.method6();  //method 6-->static
	
		//Non static method called with object reference
		GrandChild gc = new GrandChild();
		gc.method1();
		gc.method2();
		gc.method3();
		gc.method4();
		gc.method5();
	}
}
