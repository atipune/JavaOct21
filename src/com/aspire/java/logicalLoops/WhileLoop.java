package com.aspire.java.logicalLoops;

//100 to 1 print all odd numbers

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		int i=99;			//for(int i=100; i>=1; i--)
		while(i>=1)
		{
			System.out.println(i);
			i=i-2;
		}
	}
}
