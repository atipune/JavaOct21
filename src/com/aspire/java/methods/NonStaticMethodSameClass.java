package com.aspire.java.methods;

/*					static method			non static method
 * same class			1,2						11,12
 * different class		2,3,4					12,13,14
 * different package	2,5,6					12,15,16						
 * 
 */



public class NonStaticMethodSameClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method starts");
		
		//className ObjectName = new className();
		NonStaticMethodSameClass object= new NonStaticMethodSameClass(); 
		
		//objectName.methodName
		object.method11();
		object.method12();
		object.method12();
		
		System.out.println("Main method ends");
	}
	public void method11()
	{
		System.out.println("Running non static method-11 from same class");
	}
	public void method12()
	{
		System.out.println("Running non static method-12 from same class");
	}
	
}
