package com.aspire.java.collection.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList ();
		ll.add("Ajinkya");
		ll.add(1234567890);
		ll.add("abc@gmail.com");
		ll.add('A');
		ll.add(98.5f);
		ll.add(null);
		ll.add(98.5f);
		ll.add(null);
		ll.add("Nagar");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.indexOf('A'));
		System.out.println(ll.lastIndexOf(98.5f));
		ll.add(50);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.remove("abc@gmail.com");
		System.out.println(ll);
		ll.remove(98.5f);
		System.out.println(ll);
		ll.set(6, 60);
		System.out.println(ll);
		int a=10;
		System.out.println(ll.get(6));
		System.out.println(a+(int)ll.get(6));		//object cast into int
		ll.remove("Nagar");
		System.out.println("For loop:-");
		for(int i=0; i<=ll.size()-1;i++)
		{
			System.out.print(ll.get(i)+", ");
		}
		System.out.println();
		System.out.println("Foreach loop:-");
		for( Object b:ll)
		{
			System.out.print(b+", ");
		}
		System.out.println();
//		int x = al.size();  			//similarity
		System.out.println("Iterator only in Forward:-");
		Iterator itr=ll.iterator();				//only forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Forward:-");
		ListIterator li = ll.listIterator();	//forward direction
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Reverse:-");
		ListIterator lirev = ll.listIterator(ll.size());		//reverse direction
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+", ");
		}
		System.out.println();
		System.out.println("Enumeration:-");
	}
}
