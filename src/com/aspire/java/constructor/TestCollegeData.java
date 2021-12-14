package com.aspire.java.constructor;

public class TestCollegeData 
{
	public static void main(String[] args) {
		CollegeData Dhananjay= new CollegeData();
		Dhananjay.studentName="Dhananjay Marathe";
		Dhananjay.sMbNo=12345678;
		Dhananjay.sEmail="abc@gmail.com";
		CollegeData.principalName="XYZ";			//common for all
		CollegeData.collegeName="Govt. College";	//common for all
		
		CollegeData Priyanka =new CollegeData();
		Priyanka.studentName="Priyanka Chavan";
		Priyanka.sMbNo=541324654;
		Priyanka.sEmail="a123@gmail.com";
//		CollegeData.principalName="XYZ";
//		CollegeData.collegeName="Govt. College";
		
		System.out.println("Dhananjay's Information");
		Dhananjay.collegeinfo();
		System.out.println("Priyanka's Information");
		Priyanka.collegeinfo();
	}
}
