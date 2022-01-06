package com.aspire.java.string;

public class ForEach 
{
public static void main(String[] args) {
	String s1="Aspire Training Institute Pune"; 
	int[] b= {1,2,3,4,5,6,7};
	String[] a=s1.split("");		//
	System.out.println(a.length);
	for(int i=0; i<a.length; i++)
	{
	System.out.print(a[i]+" ");
	}
	System.out.println();
	for(String s:a)
	{
		System.out.print(s+" ");
	}
	System.out.println();
	for(int Aspire:b)
	{
		System.out.println(Aspire);
	}
}
}
