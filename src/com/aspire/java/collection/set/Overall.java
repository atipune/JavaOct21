package com.aspire.java.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Overall 
{
	public static void main(String[] args) 
	{
		int[] a= {7,9,1,4,8,8,3,5,10};
		String[] s= {"Avinash","Vaibhav", "Rutuja", "Niklesh","Ashwini","Priyanka","Vaibhav"};
		System.out.println("*************Arraylist***********");
		ArrayList al = new ArrayList();
		for(int i=0; i<a.length; i++)
		{
			al.add(a[i]);
		}
		for(String name:s)
		{
			al.add(name);
		}
		System.out.println(al);
		System.out.println("*************Linkedlist***********");
		LinkedList ll = new LinkedList();
		for(int i=0; i<a.length; i++)
		{
			ll.add(a[i]);
		}
		for(String name:s)
		{
			ll.add(name);
		}
		System.out.println(ll);
		System.out.println("*************Vector***********");
		Vector v = new Vector();
		for(int i=0; i<a.length; i++)
		{
			v.add(a[i]);
		}
		for(String name:s)
		{
			v.add(name);
		}
		System.out.println(v);
		System.out.println("*************HashSet***********");
		HashSet hs = new HashSet();
		for(int i=0; i<a.length; i++)
		{
			hs.add(a[i]);
		}
		for(String name:s)
		{
			hs.add(name);
		}
		System.out.println(hs);
		System.out.println("*************Linked HashSet***********");
		LinkedHashSet lhs = new LinkedHashSet();
		for(int i=0; i<a.length; i++)
		{
			lhs.add(a[i]);
		}
		for(String name:s)
		{
			lhs.add(name);
		}
		System.out.println(lhs);
		System.out.println("*************Treeset***********");
		TreeSet ts = new TreeSet();
//		for(int i=0; i<a.length; i++)
//		{
//			ts.add(a[i]);
//		}
		for(String name:s)
		{
			ts.add(name);
		}
		System.out.println(ts);
	}
}
