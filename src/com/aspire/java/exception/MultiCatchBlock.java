package com.aspire.java.exception;

public class MultiCatchBlock 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=0;
		int d;
		int f;
		int[] ar= {1,2,3,4,5,6,7,8,9,10};
		
		try
		{
				try
				{
					d=ar[8]/c;
				}
				catch(ArithmeticException e)
				{
					System.out.println("Do not divide with zero");
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Selected index of array should be less than length of array");
				}
				
			
			f=ar[15]/c;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Do not divide with zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Selected index of array should be less than length of array");
		}
		finally 
		{
			System.out.println("Finally block execution");
		}
	}
}
