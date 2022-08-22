package com.aaray;

import java.util.Arrays;

class Iteam
{
	int id,cost;
	String name;
	
	Iteam(){}

	public Iteam(int id, int cost, String name) {
		super();
		this.id = id;
		this.cost = cost;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Iteam [id=" + id + ", cost=" + cost + ", name=" + name + "]";
	}	
}
class Product
{
	public void show(Iteam[] a)
	{
		for(Iteam i:a)
		{
			System.out.println(i);
		}
	}
}
public class ArrayObject1 {
	public static void main(String[] args) {
		Iteam[] a=new Iteam[2];
		a[0]=new Iteam(1, 25000, "mobile");

		a[1]=new Iteam(2, 30000, "iphone");
		Product p=new Product();
		
		p.show(a);
		System.out.println(Arrays.toString(a));
	
		

		
	}
}
