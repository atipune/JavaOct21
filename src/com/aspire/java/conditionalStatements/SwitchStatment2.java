package com.aspire.java.conditionalStatements;

//ATM operation
//cash widrawl, mini statement, balance check, pin code change, mb baking register, fund transfer

public class SwitchStatment2 {
public static void main(String[] args) {
	String input = "cw";
	
	switch(input)
	{
	case "cw":
		System.out.println("Cash Withdrawl");
		break;
	case "ms":
		System.out.println("Mini Statement");
		break;
	case "bc":
		System.out.println("Balance check");
		break;
	case "pc":
		System.out.println("pin change");
		break;
	case "Mb":
		System.out.println("Mobile banking registartion");
		break;
	case "ft":
		System.out.println("fund transfer");
		break;
	default :
		System.out.println("Invalid input");
		break;
	}
}
}
