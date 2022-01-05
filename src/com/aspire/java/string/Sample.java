package com.aspire.java.string;

public class Sample 
{
	public static void main(String[] args) 
	{
		String s="atipune";
		String s1="Aspire";
		String s2="Aspire";
		String s3= new String("Aspire");
		String s4= new String("Aspire");
		String s5="aspire";
		String s6= new String("aspire");
		
		System.out.println(s1==s2);			//true
		System.out.println(s1==s3);			//flase
		System.out.println(s3==s4);			//false   //== object
		System.out.println(s2==s4);			//false
		System.out.println(s1==s5);			//false
		System.out.println(s3==s5);			//false
		System.out.println(s5==s6);			//false
		
		System.out.println(s1.equals(s2));	//true
		System.out.println(s1.equals(s3));	//true
		System.out.println(s3.equals(s4));	//true
		System.out.println(s2.equals(s4));	//true
		System.out.println(s1.equals(s));	//false
		System.out.println(s1.equals(s5));	//false
		System.out.println(s1.equals(s6));	//false
		System.out.println(s5.equals(s6));	//true
	}
}
