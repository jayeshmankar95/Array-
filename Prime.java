package com.arrayassi;

public class Prime {
	public static void checkPrime(int num)
	{
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
			flag=true;
			break;
			}
		}
			if(!flag)
				System.out.println("prime");
			else
				System.out.println("not prime");
	}
	
	public static void main(String[] args) {
		
		Prime.checkPrime(11);
		Prime.checkPrime(12);
	}

}
