package com.aspire.java.oops.accessSpecifierDiff;

import com.aspire.java.oops.accessSpecifier.Parent;
import com.aspire.java.oops.accessSpecifier.Sample;

public class ChildfromDiffClass extends Parent
{
	public static void main(String[] args) {
		
	
	Parent p = new Parent();
	p.m1();		//Public method from diff pack with inheritance	w.r.t. Parent class object
	ChildfromDiffClass cdc=new ChildfromDiffClass();
	cdc.m1();	//Public method from diff pack with inheritance	w.r.t. child class object
	cdc.m3();	//Protected method from diff pack with inheritance w.r.t. child class object
	
	Sample s2= new Sample();
	{
		s2.m9();	//public method from diff pack diff class
	}
			
	}
}
