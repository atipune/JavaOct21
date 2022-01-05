package com.aspire.java.string;

public class StringCase 
{
	public static void main(String[] args) 
	{
		String s1= "Aspire Training Institute"; //Lowercase+Uppercase
		String s2="aspire";	//lowercase
		String s3="PUNE";	//Uppercase
		String s4="                                   ";
		System.out.println(s1.toUpperCase()); 	//Convert s1 string Upper case
		System.out.println(s1.toLowerCase());	//convert s1 string lower case
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.length()); 		//length of string-->char count
		System.out.println(s2.length());
		System.out.println(s4.length());
	}
}
