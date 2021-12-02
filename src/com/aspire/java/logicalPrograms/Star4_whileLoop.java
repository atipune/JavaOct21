package com.aspire.java.logicalPrograms;
//*				
//**				
//***				
//****				
//*****				
//******			
//Rows=6, columns=6

public class Star4_whileLoop {
	public static void main(String[] args) {
		
		int i=1;
		while(i<=6)										//for(int i=1; i<=6; i++)
		{
			int j=1;
			while(j<=i)												//for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
	
}
