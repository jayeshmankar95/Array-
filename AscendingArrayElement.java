package com.arraydemo;

public class AscendingArrayElement {
	
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
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("after ascending:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		int[] arr= {5,7,9,8,1,3,4};
		AscendingArrayElement.show(arr);
		
		/* OUTPUT
		original array
		5 7 9 8 1 3 4 
		after ascending:
		1 3 4 5 7 8 9  */
	}

}
