package com.aspire.java.oops.accessSpecifier;

//Same package - Parent class

public class Parent 
{
	public void m1()	//Higest
	{
		System.out.println("Public method from Parent class");
	}
	protected void m3()
	{
		System.out.println("Protected method from Parent class");
	}
	void m2()	//default method
	{
		System.out.println("Default method from Parent class");
	}
	private void m4()	//lowest
	{
		System.out.println("Private method from Parent class");
	}
}
