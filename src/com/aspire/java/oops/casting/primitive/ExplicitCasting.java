package com.aspire.java.oops.casting.primitive;

public class ExplicitCasting 
{
	public static void main(String[] args) 
	{
	double p=1564525.134154;
	float q;
	long r;
	int s;
	short t;
	byte u;
	q=(float) p;   //p is typecast into float
	r=(long) q;
	s=(int) p;
	t=(short)s;
	u= (byte)t;
	System.out.println("double p="+p);
	System.out.println("float q="+q);
	System.out.println("long r="+r);
	System.out.println("int s="+s);
	System.out.println("short t="+t);
	System.out.println("byte u="+u);
	}
}
