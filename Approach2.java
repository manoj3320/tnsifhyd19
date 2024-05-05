package com.tnssi.day1;


class Approach3
{
		int a=10;
		static int b=20;
		void display() 
		{
			System.out.println(a);
		}
		static int display1() 
		{
			System.out.println(b);
			return b;
		}
}
public class Approach2
{
	public static void main(String[] args) 
	{
		int c=40;
		Approach3 a1 =new Approach3();
		System.out.println(a1.a);
		a1.display();
		System.out.println(Approach3.b);
		Approach3.display1();
		System.out.println(c);
	}
}
