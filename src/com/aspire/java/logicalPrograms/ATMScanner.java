package com.aspire.java.logicalPrograms;

import java.util.Scanner;

public class ATMScanner
{

public static void main(String[] args)

{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your password: ");
    int pwd=scan.nextInt();
    System.out.println("Enter amount: ");
    int amount =scan.nextInt();
    System.out.println("Password is ="+pwd);
    System.out.println("Amount is ="+amount);

}
	
	
}
