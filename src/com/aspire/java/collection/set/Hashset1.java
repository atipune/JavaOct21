package com.aspire.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset1 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet ();
		System.out.println(hs.isEmpty());
		hs.add("Ajinkya");
		hs.add(47.25);
		hs.add(1234567890);
		hs.add("abc@gmail.com");
		hs.add('A');
		hs.add(98.5f);
		hs.add(null);
		hs.add(98.5f);
		hs.add(null);
		hs.add("Nagar");
		hs.add("Ajinkya");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.remove(98.5f);
		System.out.println(hs);
	
//		for(int i=0; i<hs.size();i++)		//no get method available in hashset
//		{
//			System.out.println(hs.get);
//		}
		System.out.println("Data with Foreach loop");
		for(Object a:hs)
		{
			System.out.print(a+", ");
		}
		System.out.println();
		System.out.println("Data with iterator");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
	}
	
}
