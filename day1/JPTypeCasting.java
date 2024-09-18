package com.tnssi.day1;

public class JPTypeCasting {

	public static void main(String[] args) {
		// widening or implicit type casting
		
		byte a = 14 ;
		int b = a ;
		System.out.println(b);
		
		char c = 20 ;
		int d = c ;
		System.out.println(d);
		
		float f = 20.5f ;
		double db = f;
		System.out.println(db);
		
		long l = 2567 ;
		double db1 = l ;
		System.out.println(db1);
		
		
		// narrowing or explicit type casting

		int i1 = 20 ;
		short s = (short) i1 ;
		System.out.println(s);
		
		double db2 = 20.78f ;
		float f1 = (float) db2 ;
		System.out.println(f1);
		
		int i2 = 20 ;
		char ch = (char) i2 ;
		System.out.println(ch);
		
		double db3 = 10.52f ;
		long l1 = (long) db3 ;
		System.out.println(l1);
	}

}
