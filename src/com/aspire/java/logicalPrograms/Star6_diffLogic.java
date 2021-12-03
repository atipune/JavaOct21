package com.aspire.java.logicalPrograms;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
// * * * *
//  * * *
//   * *
//    *
//1st part- rows=1-5, star/column=1-5, spaces=4-0
//2nd part- rows=1-4, star/column=4-1, spaces=1-4

//New logic- rows-1-9
public class Star6_diffLogic 
{
	public static void main(String[] args) 
	{
		for(int row=1; row<=9;row++)
		{
			if(row<=5)
			{
				for(int space1=4;space1>=row;space1--)
				{
					System.out.print(" ");
				}
				for(int star1=1;star1<=row;star1++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			else
			{	
				for(int space2=1;space2<=row-5;space2++)
				{
					System.out.print(" ");
				}
				for(int star2=4; star2>=row-5;star2--)
				{
					System.out.print("* ");
				}
				System.out.println();
			}	
		}
	}
}
