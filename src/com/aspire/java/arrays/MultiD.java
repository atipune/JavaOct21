package com.aspire.java.arrays;
//i(row)=4 (0-3)
//j(column)=5 (0-4)
public class MultiD 
{
	public static void main(String[] args) 
	{
//		int[] b[]= {{}};
//		int c[][]= {{}};
//		int[] []d= {{}};
//		int [][]e= {{}};
		int[][] g={{0,1,2,3,4},{5,6,7,8,9},{10,11,12,13,14},{15,16,17,18,19}};	//4x5 equal columns
		int[][] a= {{0,1,2},{5,6,7,8,9,20},{10,11,12,13,14},{15,16,17,18,19}};	//array of array
		int[][] f= new int[2][3];
		f[0][0]=0;
		f[0][1]=1;
		f[0][2]=2;
		//f[0][3]=3;	//extra
		//f[0][4]=4;	//extra
		f[1][0]=5;
		f[1][1]=6;
		f[1][2]=7;
		System.out.println("a[]=");
		for(int i=0; i<4;i++)
		{
			for(int j=0; j<a[i].length; j++)	//3  6  5  5
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("g[]=");
		
		for(int i=0; i<4; i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(g[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("f[]=");
		for(int i=0; i<2; i++)	//row
		{
			for(int j=0; j<3; j++)	//column
			{
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
		
				

		
	}
}
