package com.aspire.java.oops.interface1;

abstract public class Child implements Inter_face, Inter_face2 
{


	abstract public void method1();	//grand child class -->method block


	public void method2() {
	System.out.println("Running Child class: method 2");
		
	}


	public void method3() {
		System.out.println("Running Child class:  method 3");
		
	}
	public void method4()
	{
		System.out.println("Running child class: method 4");
	}
	public void method5()
	{
		System.out.println("Running child class: method5");
	}

}
