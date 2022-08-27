package com.arraydemo;

public class SecondLargest {
	static void show(int[] a)
	{
		int size,temp;
		
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
		System.out.println(a[a.length-2]);
	}
	public static void main(String[] args) {
		int[] a= {12,60,23,45,54,65};
		SecondLargest.show(a);
	}

}
