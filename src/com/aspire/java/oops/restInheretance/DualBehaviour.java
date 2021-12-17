package com.aspire.java.oops.restInheretance;

//Dual behaviour
//Behaves as child class for Parent class
//Behaves as Parent for Child class

public class DualBehaviour extends Parent
{
	public void farm()
	{
		System.out.println("farm from Parent/Child class");
	}
	public void money()
	{
		System.out.println("Maney from Parent/Child class");
	}
}
