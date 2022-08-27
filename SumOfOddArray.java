package com.arraydemo;

public class SumOfOddArray {
	void displaySum(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			if(a[i]%2!=0)
			{
				sum=sum+a[i];
				System.out.println(a[i]+sum);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {3,2,4,5,6,7,8};
		SumOfOddArray s=new SumOfOddArray();
		s.displaySum(arr);
	}
}
