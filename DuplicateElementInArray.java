package com.arraydemo;

public class DuplicateElementInArray {
					
		// duplicate element in array
	
	static void show(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.print(a[j]+" ");		
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr= {1,9,3,4,5,6,4,3,8,9};
		DuplicateElementInArray.show(arr);
		
	}

}
