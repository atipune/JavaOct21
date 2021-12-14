package com.aspire.java.constructor;

public class CollegeData 
{
	String studentName;		//instance variable
	int sMbNo;				//instance variable
	String sEmail;			//instance variable
	static String principalName;	//static variable
	static String collegeName;		//static variable
	
	public void collegeinfo()
	{
		System.out.println(studentName);
		System.out.println(sMbNo);
		System.out.println(sEmail);
		System.out.println(principalName);
		System.out.println(collegeName);
	}
}
