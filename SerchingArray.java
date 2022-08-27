package com.arraydemo;

import java.util.Scanner;

public class SerchingArray {
	static void show(int[] a)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Key value: ");
		int key=sc.nextInt();
		
		 for(int i=0;i<a.length;i++)
	        {
	            if(key==a[i])
	            {
	                System.out.println("Element Found at :"+i+" index");
	                System.exit(0);
	            }
	        }
	        System.out.println("Not found");
	}
	
	public static void main(String[] args) {
	
		int[] arr= {12,2,4,5,6,8,9,13,15};

		SerchingArray.show(arr);
	}
}
