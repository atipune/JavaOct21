package com.aspire.java.logicalPrograms;

public class DuplicateValuesFromArray 
{
	public static void main(String[] args) 
	{
		int[] a= {2,4,6,7,9,1,7,5,89};	//7
		int count=0;
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate value="+a[i]);
					count++;
				}
			}
		}
		System.out.println("Total duplicate values="+count);
	}
}
