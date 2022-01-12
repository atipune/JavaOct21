package com.aspire.java.collection.map;

import java.util.HashMap;

public class Map 
{
	public static void main(String[] args) 
	{

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		//<Key, Value>
		hm.put(1, "Ashwini");
		
		hm.put(4, "Priyanka");
		hm.put(5, "Rutuja");
		hm.put(5, "Vaibhav");
		hm.put(2, "Dhananjay");
		hm.put(3, "Dhananjay");
		System.out.println(hm);
		System.out.println(hm.containsKey(4));
		System.out.println(hm.containsValue("Ashwini"));
		System.out.println(hm.get(4));
		for(int i=1; i<=hm.size();i++)
		{
			System.out.print(hm.get(i)+", ");
		}
		System.out.println();
		hm.remove(4);
		hm.put(6, "Sagar");
		hm.put(2, "Sachin");
		System.out.println(hm);
		
	}
}
