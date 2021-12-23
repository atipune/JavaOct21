package com.aspire.java.oops.Polymorphism.methodOverriding;

public class Child extends Parent
{
	public void money()	//Declaration
	{
		//Defination
		System.out.println("Child Money = Rs. 10000");
	}
	public void farm()
	{
		System.out.println("Child Farm = 1 Acres");
	}
	public void bunglow()
	{
		System.out.println("Child Bunglow = 2");
	}
	public void bike()
	{
		System.out.println("Child Bike = 1");
	}
//	public void DaughterInLaw()	//-->Final method from parent class can not be overrride
//	{
//		
//	}
	public static void Jwellary()
	{
		System.out.println("Child's Jwellary");
	}
	public void addition(int i, int j)
	{
		int k=2*i+3*j;
		System.out.println("Child addition ="+k);
	}
}
