package com.aspire.java.arrays;

import java.util.Arrays;

public class OneD 
{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9,10};		//size=length= count of elements in that array
		int []b= {11,12,13};
		int c[]= {14,15,16,17,18};
		char[] d= {'A','B','C','D'};
		String[] e= {"A", "10.5", "Institute", "Pune"};
		
		int[] i= new int[7];
		i[0]=5;
		i[1]=6;
		i[2]=7;
		i[3]=8;
		i[4]=9;
		i[5]=10;
		i[6]=11;
		
		System.out.println("Length of i[]="+i.length);
		System.out.println("Element of 3rd index in a[]="+a[3]);
		int sum=a[8]+b[2];		//9  13
		System.out.println("a[8]+b[2]="+sum);
		for(int k=0;k<=a.length-1;k++)
		{
		System.out.print(a[k]+",");
		}
		System.out.println();
		for(int j=0; j<=e.length-1;j++)
		{
			System.out.print(e[j]+" ");
		}
		System.out.println();
		int[] f= {12,5,18,35,45,2,984,5,64,4556};
		System.out.println("Sorting f[]");
		Arrays.sort(f);
		for(int l=0; l<f.length; l++)
		{
			System.out.print(f[l]+" ");
		}
		System.out.println();
		System.out.println("Reverse sorted f[]");
		for(int m=f.length-1;m>=0; m--)
		{
			System.out.print(f[m]+" ");
		}	
		
		
	}
}
