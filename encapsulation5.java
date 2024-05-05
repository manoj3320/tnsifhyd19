package com.oop.encapsulation;

import com.oop.*;

public class encapsulation5 {
	
	private String name="john";
	private int age=25;
	private String gender="Male";
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public static void main(String[] args) {
		encapsulation5 e5 = new encapsulation5();
		
		
		System.out.println(e5.getAge());
		System.out.println(e5.getName());
		System.out.println(e5.getGender());
	
	}
}
