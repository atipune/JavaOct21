package com.aspire.java.methods;

import java.util.Scanner;

public class ParameterizedMethod
{
    public static void main(String[] args)
    {
    addition(10,20,30);
    addition(15,25,35);
    Scanner scan=new Scanner(System.in);
    System.out.println("Addition of 3 numbers from user input");
    addition(scan.nextInt(),scan.nextInt(),scan.nextInt());
    }
    public static void addition(int a, int b, int c)
    {
        int d=a+b+c;
    System.out.println(d);
    }
}
