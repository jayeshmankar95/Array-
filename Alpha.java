package com.aaray;

public class Alpha {
	public static void showArray(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
	}
	public static void main(String[] args) {
		
		String[] a= {"hi","how","are","you","doing"};
		Alpha.showArray(a);
		
	}

}
