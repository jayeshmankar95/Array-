package com.arrayassi;

public class OddSum {
	public static void main(String[] args) {
		
		int[] a= {2,3,6,7,5};
		
		int oddsum=0;
		int evensum=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				oddsum=oddsum+a[i];
				//System.out.println(oddsum);
			}
			else if(i%2==0)
			{
				evensum=evensum+a[i];
			}
			else {
				System.out.println("not");
			}
			
		}System.out.println(oddsum+" odd");
		System.out.println(evensum);
	}

}
