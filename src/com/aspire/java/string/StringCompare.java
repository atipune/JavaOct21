package com.aspire.java.string;
//==
//.equals()

public class StringCompare 
{
	public static void main(String[] args) 
	{
		String s1="";
		String s2="aspire";
		String s3="ASPIRE";
		String s4="AspiRE";
		String s5= new String("Aspire");
		System.out.println(s2.equals(s3)); 	//false
		System.out.println(s2.equalsIgnoreCase(s3));  //true
		System.out.println(s4==s5); 	//false
		System.out.println(s4.equals(s5));	//false
		System.out.println(s4.equalsIgnoreCase(s5)); //true
	}
}
