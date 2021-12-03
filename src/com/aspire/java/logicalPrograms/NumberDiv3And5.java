package com.aspire.java.logicalPrograms;
//Numbers divisible by 3 & 5 from 1-100

public class NumberDiv3And5 
{
	public static void main(String[] args) 
	{
		for(int i=500; i<=1000;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
