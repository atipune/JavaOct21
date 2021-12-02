package com.aspire.java.conditionalStatements;

//pune-mumbai
public class ElseIf2 {
public static void main(String[] args) {
	int amount =100;
	if(amount>300)
	{
		System.out.println("You can travel from Pune to Mumbai");
	}
	else if(amount>200)
	{
		System.out.println("You can travel up to Panvel");
	}
	else if(amount>100)
	{
		System.out.println("you can travel upto Lonavala");
	}
	else if(amount>50)
	{
		System.out.println("You can travel from pune to Talegaon");
	}
	else
	{
		System.out.println("No traving possible for me");
	}
}
}
