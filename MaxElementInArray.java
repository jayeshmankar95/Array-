package com.arraydemo;

public class MaxElementInArray 
{
	static void show(int[] a)
	{
		int max = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];
		}	System.out.println(max);
	}

	public static void main(String[] args) 
	{
		int[] arr= {12,43,23,34,56,76,78,98};
		MaxElementInArray.show(arr);
	}
}
