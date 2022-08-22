package com.arrayassi;

public class AvrageOfArray {
	
	public static void findavg(int[] arr)
	{
		int sum=0;double avg;
		for(int x:arr)
		{
			sum=sum+x;	
		}
        avg=sum/arr.length;
		
		System.out.println("sum is :"+sum);	
		System.out.println("average of array: "+avg);
	}
	public static void main(String[] args) {
		
		int arr[]= {1,5,5,9};
		AvrageOfArray.findavg(arr);
		
	}

}
