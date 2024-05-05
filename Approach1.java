package com.tnssi.day1;

public class Approach1 {
  int a=10; //instance variable
  static int b=20; // static variable
  void display() {
  System.out.println(a);
  }
  static int display1() {
	  System.out.println(b);
	  return b;
  }
  public static void main(String []args) {
	int c=30; //local variable
	Approach1 a1=new Approach1();
	System.out.println(a1.a);
	a1.display();
	System.out.println(Approach1.b);
	Approach1.display1();
	System.out.println(c);
  }
}
