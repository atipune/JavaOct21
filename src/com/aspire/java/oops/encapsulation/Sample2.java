package com.aspire.java.oops.encapsulation;

public class Sample2 extends Sample
{
	int i=50;
	private int j=60;
	public void multi()
	{
//		Sample s = new Sample();
//		int k=i*j*s.c;
		
		int k=i*j*c;
		System.out.println(k);		
	}
}
