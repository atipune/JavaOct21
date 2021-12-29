package com.aspire.java.oops.casting.primitive;

//Lower data type--> higher data type

public class ImplicitCasting 
{
	public static void main(String[] args) 
	{
		byte a=10;
		short b;
		int c;
		long d;
		float e;
		double f;
		b=a;
		c=(int)a;		//a is typecast to int
		d=a;
		e=a;
		f=a;
		System.out.println("byte a="+a);
		System.out.println("short b="+b);
		System.out.println("int c="+c);
		System.out.println("long d="+d);
		System.out.println("float e="+e);
		System.out.println("double f="+f);
	}
}
