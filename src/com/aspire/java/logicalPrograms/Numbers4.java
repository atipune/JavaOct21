package com.aspire.java.logicalPrograms;

//12345
//23456
//34567
//45678
//rows=4, columns=5

public class Numbers4 {
	public static void main(String[] args) {
		for(int i=1;i<=4; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print(i+j-1+" ");
			}
			System.out.println();
		}
	}
	
}
