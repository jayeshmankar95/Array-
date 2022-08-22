package com.arraygit;

public class FindMinArray {
	//Minimum Element Of Array
	 static void minElement(int[] a)
	 {
		 int min=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[0]<min)
			 {
				min=a[i];
			 }
		 }
		 System.out.println("minimum element: "+min);
	 }
	 	// max element of array
	 static void maxElement(int[] a)
	 {
		 int max=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(a[i]>max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println("max Element is: "+max);
	 }
	 
	public static void main(String[] args) {
		int[] a= {1,2,4,78,6,4};
		FindMinArray.minElement(a);
		FindMinArray.maxElement(a);
		
	}

}
