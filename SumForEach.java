package com.arraydemo;

public class SumForEach {
	
	static void show(int[] a)
	{
      int sum=0;
      for(int x : a)
      {
    	  sum=sum+x;
      } System.out.print("Sum is: "+sum);
		
	}
	
	public static void main(String[] args) {
		int[] arr= {1,4,5,10};
		SumForEach.show(arr);
	}

}
