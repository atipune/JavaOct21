package com.aspire.java.constructor;

public class MultiConsTest 
{
	public static void main(String[] args) {
		MultiCons object1 = new MultiCons();
		object1.addition();		//10+20=30
		object1.subtraction();	//10-20=-10
		
		MultiCons object2=new MultiCons(100,50);
		object2.addition();		//100+50=150
		object2.subtraction();	//100-50=50
		
		MultiCons object3=new MultiCons(25,15,5);
		object3.addition();		//25+15*5=100
		object3.subtraction();	//15*5-25=50
	}
}
