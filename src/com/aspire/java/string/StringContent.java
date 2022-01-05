package com.aspire.java.string;

public class StringContent 
{
	public static void main(String[] args) 
	{
		String s1= "Aspire Training Institute"; 	//length=25
		String s2="aspire";	
		String s3="PUNE";	
		String s4="";
		String s5="in";
		System.out.println(s4.isEmpty());  //true
		System.out.println(s3.isEmpty());  //false
		System.out.println(s1.charAt(24));
		char a=s1.charAt(5);
		System.out.println(a);
		System.out.println(s1.contains(s5));
		System.out.println(s1.contains(s2));
		System.out.println((s1.toLowerCase()).contains(s2.toLowerCase()));	//true
		System.out.println(s1.indexOf('e'));	//first match index number
		System.out.println(s1.lastIndexOf('e')); //last match index number
		System.out.println(s2.startsWith("Asp"));
		System.out.println(s1.endsWith("te"));
	}
}
