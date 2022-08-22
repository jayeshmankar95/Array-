package com.aaray;

public class Declare {
	public static void main(String[] args) {
		
		int[] a=new int[2];
		a[0]=9;
		a[1]=3;
		//a[3]=4;
		System.out.println(a.length);
		int[][] b=new int[][]{
			{1,2,4},{3,2,4}
		};
		System.out.println(b.length);
		System.out.println(b[0][0]);
		System.out.println(b[1].length);
	}

}
