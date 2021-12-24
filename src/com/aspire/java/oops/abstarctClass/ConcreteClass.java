package com.aspire.java.oops.abstarctClass;

public class ConcreteClass extends AbstractClass
{

	public void subtraction() 
	{
		int sub=a-b;
		System.out.println("sub="+sub);
		
	}

	public void multiplication() 
	{
		int multi=a*b;
		System.out.println("Multi="+multi);
		
	}

	
	public void division() 
	{
		int div;
		div=a/b;
		System.out.println("Div="+div);
	}
	public static void main(String[] args) {
		ConcreteClass cc= new ConcreteClass();
		cc.addition();			//parent - concrete method
		cc.subtraction();		//Parent - abstarct
		cc.multiplication();	//Parent - abstarct
		cc.division();			//Parent - abstarct
	}
}
