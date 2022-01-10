package com.aspire.java.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		Vector v= new Vector();
		v.add("Ajinkya");
		v.add(1234567890);
		v.add("abc@gmail.com");
		v.add('A');
		v.add(98.5f);
		v.add(null);
		v.add(98.5f);
		v.add(null);
		v.add("Nagar");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf('A'));
		System.out.println(v.lastIndexOf(98.5f));
		v.add(50);
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		v.remove("abc@gmail.com");
		System.out.println(v);
		v.remove(98.5f);
		System.out.println(v);
		v.set(6, 60);
		System.out.println(v);
		int a=10;
		System.out.println(v.get(6));
		System.out.println(a+(int)v.get(6));		//object cast into int
		v.remove("Nagar");
		System.out.println("For loop:-");
		for(int i=0; i<=v.size()-1;i++)
		{
			System.out.print(v.get(i)+", ");
		}
		System.out.println();
		System.out.println("Foreach loop:-");
		for( Object b:v)
		{
			System.out.print(b+", ");
		}
		System.out.println();
//		int x = al.size();  			//similarity
		System.out.println("Iterator only in Forward:-");
		Iterator itr=v.iterator();				//only forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Forward:-");
		ListIterator li = v.listIterator();	//forward direction
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Reverse:-");
		ListIterator lirev = v.listIterator(v.size());		//reverse direction
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+", ");
		}
		System.out.println();
		System.out.println("Enumeration:-");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.print(en.nextElement()+", ");
		}
	}
}
