package com.aspire.java.oops.Polymorphism.methodOverloading;

public class Overloading 
{
	int a=10;
	public void addition()
	{
		int b=20;
		int c=a+b;
		System.out.println("Addition method with no parameter ="+c);
	}
	public void addition(int d)
	{
		int e=a+d;
		System.out.println("Addition method with 1 int parameter ="+e);
	}
	public void addition(int f, int g)
	{
		int h=a+f+g;
		System.out.println("Addition method with 2 int parameter ="+h);
	}
	public void addition(String s)
	{
		System.out.println("Addition method with 1 string parameter"+s);
	}
	public void addition(float i, int j)
	{
		double k=a+i+j;
		System.out.println("Addition method with 1 float & 1 int parameter"+k);
	}
	public void addition(int i, float j)
	{
		
	}
	
	
}
