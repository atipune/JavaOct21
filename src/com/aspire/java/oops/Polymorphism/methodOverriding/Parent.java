package com.aspire.java.oops.Polymorphism.methodOverriding;

public class Parent 
{
	public void money()
	{
		System.out.println("Parent Money = Rs. 50000");
	}
	public void farm()
	{
		System.out.println("Parent Farm = 10 Acres");
	}
	public void bunglow()
	{
		System.out.println("Parent Bunglow = 1");
	}
	public void car()
	{
		System.out.println("Parent car= 1");
	}
	final public void DaughterInLaw()
	{
		System.out.println("Parent declared final keyword for DaughterInLaw()");
	}
	public static void Jwellary()
	{
		System.out.println("Patent declared static keyword for Jwellary()");
	}
	public void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("Parent addition ="+c);
	}
}
