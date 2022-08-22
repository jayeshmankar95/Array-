package com.arrayassi;
				// WAJP2 print reverse of an array
public class Reverse {
	public static void ArrayReverse(int[] arr)
	{
		for (int i=arr.length-1;i>=0;i--) 
		{  
            System.out.print(arr[i]+" "); 
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,8,9};
		Reverse.ArrayReverse(arr);
		
	}

}
