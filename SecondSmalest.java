package com.arraydemo;

public class SecondSmalest {
	static void show(int[] a)
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("smallest number: "+a[0]);
		System.out.println("second smallest: "+a[1]);
		System.out.println("largest number: "+a[a.length-1]);
		System.out.println("second largest: "+a[a.length-2]);
	}
	
	public static void main(String[] args) {
		int[] arr= {12,32,34,97,65,101,67,98,4};
		SecondSmalest.show(arr);
	}

}
