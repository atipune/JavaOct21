package com.aspire.java.logicalPrograms;

//1-100 odd numbers

public class SumNumbers 
{
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(i%2!=1)	//i%2==1
			{
				System.out.println(i);
			}
		}
	}
}
