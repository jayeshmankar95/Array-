package com.aaray;

public class Array3 {
	void name()
	{
		String[] arr1= {"ramesh","ram","jay"};
		
		for(String x: arr1)
		{
			System.out.println(x+" "+x.length());
		}
	}
	
	void sum()
	{
		int[] arr= {1,4,6,7,8,9};
		
		int sum=0;
		for(int y:arr)
		{
			sum=sum+y;	
		}
		System.out.println("sum is :"+sum);
	}
	
	void showMin()
	{
		int[] a= {21,34,45,67};
		int min=a[0];
		
		for(int z:a)
		{
			if(z<min)
			{
				z=min;
			}
		}System.out.println("minimum : "+min);	
	}
	
	void showMax()
	{
		int[] ar1= {21,34,45,67,99};
		int max=ar1[0];
		
		for(int y:ar1)
		{
			if(y>max)
			{
				max=y;
			}
		}System.out.println("max :"+max);	
	}
	
	void sameArray()
	{
		int[] array1= {13,43,45,67,554,44,33,32};
		int[] array2= {32,33,44};
		
		for(int store1 : array1)
		{
			for(int store2 : array2)
			{
				if(store1==store2)
				{
					System.out.print(store1+" ");
					break;
				}
			}
		}
	}
	
	void occurance(int[] a)
	{
		
		int[] occ= {1,2,1,5,5,3,2};
		for(int i=0;i<occ.length;i++)
		{
			if(a[i] ==-9)
				continue;
			int count =1;// incomplete prigram ,show mobile photo to contineu
		}
		//System.out.println(occ);
		
	}
	public static void main(String[] args) {
		Array3 a3=new Array3();
		a3.name();
		a3.sum();
		a3.showMin();
		a3.showMax();
		a3.sameArray();
	
	}

}
