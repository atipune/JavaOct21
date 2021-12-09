package com.aspire.java.methods;
import com.aspire.java.DifferentPackMethods.DiffPackMethod;

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
		NonStaticMethodSameClass SCObject= new NonStaticMethodSameClass(); 
		
		//objectName.methodName
		SCObject.method11();
		SCObject.method12();
		SCObject.method12();
		
		DifferentClass DCObject =new DifferentClass();
		DCObject.method12();		//never call static method with object reference
		DCObject.method13();
		DCObject.method14();
	
		DiffPackMethod DPObject =new DiffPackMethod();
		DPObject.method12();
		DPObject.method15();
		DPObject.method16();
		
		
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
