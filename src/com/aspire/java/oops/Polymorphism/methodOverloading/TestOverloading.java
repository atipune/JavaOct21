package com.aspire.java.oops.Polymorphism.methodOverloading;

public class TestOverloading 
{
	public static void main(String[] args) {
		//parent class object
		Overloading ol= new Overloading();
//		ol.addition();
//		ol.addition(12);
//		ol.addition("ATI");
//		ol.addition(20, 22);
		
		//child class object
		ChildOverloading col=new ChildOverloading();
		col.addition(100);
		col.addition();
		col.addition(12, 14);
		col.addition(10, 12, 14, 16);
	}
	public void main()
	{
		
	}
	
}
