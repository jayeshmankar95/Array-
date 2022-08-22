package com.arrayassi;
				//find the index of an array element value. 
public class IndexOfArray {
		public static void index(int[] arr,int x)
		{
			for(int i=0;i<arr.length;i++)
			{
				if (arr[i] == x)
				{
					System.out.println("Present ");
				}
	            else 
	            {
	            System.out.println("Not present");
	            }
				System.out.println(arr[i]);
			}
		}
	public static void main(String[] args) {	
		int[] arr= {1,4,7,3,9};
		IndexOfArray.index(arr, 4);
		
	}

}
