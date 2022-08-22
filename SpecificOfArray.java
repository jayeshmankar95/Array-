package com.arrayassi;

public class SpecificOfArray {
					//WAJP2 test if an array contains a specific value.
	
	public static void find(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==7)
			{
				System.out.println("available in array "+arr[i]);
				break;
			}
			else
			{
				System.out.println("not availabe");
			}
		}
	}
	public static void main(String[] args) {
		int aar[]= {2,4,5,7,8,9};
		SpecificOfArray.find(aar);
	}
}
