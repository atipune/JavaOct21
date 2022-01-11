package com.aspire.java.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
	System.out.println(lhs.isEmpty());
	lhs.add("Ajinkya");
	lhs.add(47.25);
	lhs.add(1234567890);
	lhs.add("abc@gmail.com");
	lhs.add('A');
	lhs.add(98.5f);
	lhs.add(null);
	lhs.add(98.5f);
	lhs.add(null);
	lhs.add("Nagar");
	lhs.add("Ajinkya");
	System.out.println(lhs);
	System.out.println(lhs.size());
	System.out.println(lhs.isEmpty());
	lhs.remove(98.5f);
	System.out.println(lhs);
	System.out.println("Data with foreach");
	for(Object a:lhs)
	{
		System.out.print(a+", ");
	}
	System.out.println();
	System.out.println("Data with iterator");
	Iterator itr = lhs.iterator();
	while(itr.hasNext())
	{
		System.out.print(itr.next()+", ");
	}
	
}

}