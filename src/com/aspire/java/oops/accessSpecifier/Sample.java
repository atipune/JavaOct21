package com.aspire.java.oops.accessSpecifier;

//Same package - different class

public class Sample 
{
	public void m9()	//Higest
	{
		System.out.println("Public method from Same package Different class-Sample");
	}
	protected void m10()
	{
		System.out.println("Protected method from Same package Different class-Sample");
	}
	void m11()	//default method
	{
		System.out.println("Default method from Same package Different class-Sample");
	}
	private void m12()	//lowest
	{
		System.out.println("Private method from Same package Different class-Sample");
	}
	
	
	//All four methods can be called in same class
	public static void main(String[] args) 
	{
		Sample sam= new Sample();
		sam.m9();
		sam.m10();
		sam.m11();
		sam.m12();
	}
}
