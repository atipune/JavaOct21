package com.aspire.java.string;

public class StringOp2 
{
	public static void main(String[] args) 
	{
		String s1="Aspire Training Institute Pune"; //Pune Institute Training Aspire
					//enuP etutitsnI gniniarT eripsA
		String[] a=s1.split("");		//
		System.out.println(a.length);
//		for(int i=0; i<a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
//		for(int j=a.length-1; j>=0; j--)	//reverse
//		{
//			System.out.print(a[j]);
//		}
//		System.out.println(s1.replace('i', 'I'));
		System.out.println(s1.replace("Aspire", "ASPIREPUNE"));
		System.out.println(s1.replace("Pune", "Mumbai"));
		
	}
}
