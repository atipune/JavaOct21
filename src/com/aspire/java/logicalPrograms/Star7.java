package com.aspire.java.logicalPrograms;
//    *
//   ***
//  *****
// *******
//*********
//rows=1-5, space=4-0, star=1-9 (2+)

public class Star7 
{
	public static void main(String[] args) 
	{
		for(int row=1;row<=5;row++)
		{
			for(int space=4; space>=row;space--) 
			{
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int star=0; star<=row-2;star++)
			{
				System.out.print("**");
			}
			System.out.println();
		}
	}
}
