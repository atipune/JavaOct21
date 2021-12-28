package com.aspire.java.oops.generalisation;

public class Test 
{
	public static void main(String[] args) {
		VI v=new VI();
		v.audioCalling();
		v.sms();
		v.internet();
		v.netflix();
		
		Jio j= new Jio();
		j.audioCalling();
		j.sms();
		j.internet();
		j.hotstar();
	}
}
