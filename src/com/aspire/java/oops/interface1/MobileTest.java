package com.aspire.java.oops.interface1;

public class MobileTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Redmi");
		Redmi r=new Redmi();
		r.camera();
		r.selficamera();
		r.battery();
		r.touchscreen();
		r.storage();

		System.out.println("Samsung");		
		Samsung s= new Samsung();
		s.camera();
		s.selficamera();
		s.battery();
		s.touchscreen();
		s.ram();
	}
}
