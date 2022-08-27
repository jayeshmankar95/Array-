package com.arraydemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RedimateMethod {
	static void show(int[] a)
	{
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void main(String[] args) {
		int[] arr= {15,4,67,98,3,4,32,5};
		RedimateMethod.show(arr);
	
		
	}

}
