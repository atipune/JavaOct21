package com.aspire.java.constructor;

public class MultiCons 
{
	int a;
	int b;
	
	MultiCons()
	{
		a=10;
		b=20;
	}
	MultiCons(int c, int d)
	{
		a=c;
		b=d;
	}
	MultiCons(int i, int j,int k)
	{
		a=i;
		b=j*k;
	}
	public void addition()
	{
		System.out.println("a+b="+(a+b));
	}
	public void subtraction()
	{
		System.out.println("a-b="+(a-b));
	}
//	public void method1()
//	{
//		
//	}
//	public void method1(int i,float j)
//	{
//		
//	}
//	public void method1(float p,int q)
//	{
//		
//	}

}
