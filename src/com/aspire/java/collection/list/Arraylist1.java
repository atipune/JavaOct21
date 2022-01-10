package com.aspire.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();	//object of imported class not current class
		
		al.add("Ajinkya");
		al.add(1234567890);
		al.add("abc@gmail.com");
		al.add('A');
		al.add(98.5f);
		al.add(null);
		al.add(98.5f);
		al.add(null);
		al.add("Nagar");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.indexOf('A'));
		System.out.println(al.lastIndexOf(98.5f));
		
		al.add(50);
		System.out.println(al);
		al.remove(3);	//3rd index data want to delete
	
		System.out.println(al);
		al.remove("abc@gmail.com");
		System.out.println(al);
		al.remove(98.5f);
		System.out.println(al);
		al.set(6, 60);
		System.out.println(al);
		int a=10;
		System.out.println(al.get(6));
		System.out.println(a+(int)al.get(6));		//object cast into int
		al.remove("Nagar");
		System.out.println("For loop:-");
		for(int i=0; i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+", ");
		}
		System.out.println();
		System.out.println("Foreach loop:-");
		for( Object b:al)
		{
			System.out.print(b+", ");
		}
		System.out.println();
//		int x = al.size();  			//similarity
		System.out.println("Iterator only in Forward:-");
		Iterator itr=al.iterator();				//only forward direction
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Forward:-");
		ListIterator li = al.listIterator();	//forward direction
		while(li.hasNext())
		{
			System.out.print(li.next()+", ");
		}
		System.out.println();
		System.out.println("List Iterator in Reverse:-");
		ListIterator lirev = al.listIterator(al.size());		//reverse direction
		while(lirev.hasPrevious())
		{
			System.out.print(lirev.previous()+", ");
		}
		
	}
}
