package com.aspire.java.logicalPrograms;
//*****
//*****
//*****
//*****
//rows= 4 (i), columns=5(j)
public class Star3 {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) // 1-->true,i++
	{
		for(int j=1;j<=5;j++)//j=1-->true-->body-->j++-->true-->body--------->j++-->false-->skip the inner for loop body
		{
			System.out.print("*");
		}
		System.out.println(); //This empty printing statement moves cursor to new line
	}
}
}
