package com.arraydemo;

public class ReverseArray {
	static void show(int[] a)
	{
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("reverse array: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,5,7,8,9};
		ReverseArray.show(arr);
	}

}
