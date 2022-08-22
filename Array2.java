package com.aaray;

public class Array2 {
	int sum=1;
	void show(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	
	}
	
	
	public static void main(String[] args) {
		Array2 a2=new Array2();
		int arr[]= {23,45,32,33,44,65};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		a2.show(arr);
		
		
		
	}

}
