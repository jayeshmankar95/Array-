package com.arraydemo;

public class LargestElementArray {
	static void showElement(int[] a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			max=a[i];		
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int[] arr= {1,4,6,3,9,12};
		LargestElementArray.showElement(arr);
	}

}
