package com.arraydemo;

public class DescendingArray {
	
	static void show(int[] a)
	{
		System.out.println("original array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("after descending:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		int[] arr= {5,7,9,8,1,3,4};
		DescendingArray.show(arr);
		
		/*  OUTPUT
		original array
		5 7 9 8 1 3 4 
		after descending: 
		9 8 7 5 4 3 1 */

}
}
