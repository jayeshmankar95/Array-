package com.aaray;

import java.util.Scanner;

public class OddEven {
	public void mergeArray(int a[]) 
	{
		
	}
	
	
	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 num");
		String str=sc.nextLine();
		String num[]=str.split(" ");
		
		int arr[]=new int[num.length];	
		
		for(int i=0;i<arr.length;i++)
		{
			int x=Integer.parseInt(num[i]);
			arr[i]=x;
		}
	}

}
