package com.tnssi.day1;

public class JPPrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	// byte takes 1 byte
		byte byteMax = 127 ;
		byte byteMin = -128 ;
		System.out.println("The Range of Minimum byte of byte is " + byteMin + " to The Range of Maximum byte of byte is " + byteMax );
				
	//	short takes 2 bytes
		short shortMax = 32767 ;
		short shortMin = -32768 ;
		System.out.println("The Range of Minimum byte of short is " + shortMin +" to The Range of Maximum byte of short is " + shortMax);

	// int takes 4 bytes
		int intMax = 2147483647 ;
		int intMin = -2147483648 ;
		System.out.println("The Range of Minimum byte of int is " + intMin + "to The Range of Maximum byte of int is " + intMax);
		
	// long takes 8 bytes 
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		System.out.println("The Range of Minimum byte of long is " + longMin + "to The Range of Maximum byte of long is " + longMax);
	
	// float takes 4 bytes
		float f=3234.141243278345f;
		System.out.println("The Range of Maximum byte of float is " + f);
		
	//	double takes 8 bytes
		double d=3456.14124512345678902345678914f;
		System.out.println("The Range of Maximum byte of double is " + d);
				
	//boolean takes 1 bit
		boolean flag = true ;
		System.out.println("The boolean value is "+flag);
		
	// char takes 1 byte
		char ch = 'M';
		System.out.println("The char value is " + ch);
		
	}

}
