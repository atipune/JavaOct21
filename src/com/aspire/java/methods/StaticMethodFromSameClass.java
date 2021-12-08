package com.aspire.java.methods;

import com.aspire.java.DifferentPackMethods.DiffPackStaticMethod;
//import packageName.className

/*					static method		non static method
 * same class			1,2
 * different class		2,3,4
 * different package	5,6
 * 
 */

public class StaticMethodFromSameClass 
{
	public static void main(String[] args) {
		System.out.println("Main method starts");
		//methodName()
		method2();		//same class
		method1();		//same class
		method2();		//same class
		
		//className.methodname
		DifferentClass.method3();	//Different Class
		DifferentClass.method2();	//Different Class
		DifferentClass.method4();	//Different Class
		DifferentClass.method3();	//Different Class
		
		
		DiffPackStaticMethod.method5();		//Different package
		DiffPackStaticMethod.method6();		//Different package
		DiffPackStaticMethod.method2();		//Different package
		DiffPackStaticMethod.method5();		//Different package
		
		System.out.println("Main method ends");
	}
	
	public static void method1()	//static method from same class
	{
		System.out.println("Running static method-1 from same class");
	}
	public static void method2()
	{
		System.out.println("Running static method-2 from same class");
	}
}
