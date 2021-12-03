package com.aspire.java.logicalLoops;

public class Do_While2 
{
	public static void main(String[] args) {
		int marks=40;
		int passingMarks=40;
		do
		{
			if(marks>=passingMarks)
			{
				System.out.println("Congratulations You are pass");
			}
			else
			{
			System.out.println("Your marks "+marks+ " are less, please appear in exam");
			marks++;
			}
		}
		while(marks<passingMarks);
	}
}
