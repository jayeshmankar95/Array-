package com.aaray;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	
	void showArray(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	void showArray1(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	void showArray3(char c[])
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
	
	void even(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println("even element: "+a[i]);
				
		}System.out.println("---");
	}
	
	void odd(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println("odd element: "+a[i]);
		}System.out.println("---");
	}
	
	void minimum(int []a)
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}System.out.println("---");
		System.out.println(min+" "+"is minimum");
	}
	
	void Maximum(int []a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}System.out.println("---");
		System.out.println(max+" "+"is maximum");
	}
	
	void sumOfArray(int []a)
	{
		int sum=a[0];
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("----");
		System.out.println("sum of array element is "+sum);
		
	}
	
	void reverse(int[] arr)
	{
		int sum =arr[0];
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
		}
	}
	
	
	
	public static void main(String[] args) {
	
		Array1 a1=new Array1();
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {1,4,6,7,8,3,4};
		char arr1[]= {'a','d','e'};
		String arr2[]= {"Ram","ganu"};
		
		System.out.println(arr.length);
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("----------");
		
	
//		a1.showArray3(arr1);
//		a1.showArray1(arr2);
//		a1.showArray(arr);
		a1.even(arr);
		a1.odd(arr);
		a1.minimum(arr);
		a1.Maximum(arr);
		a1.sumOfArray(arr);
		
		
		
	
	}

}
