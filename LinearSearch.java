package com.arraydemo;

public class LinearSearch {
	
	static int show(int[] a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			return i;
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int[] arr= {12,21,32,45,65,32,13};
		int key=65 ;
		LinearSearch l=new LinearSearch();
		System.out.println(key+" is found at index: "+LinearSearch.show(arr, key)); 
	}

}
