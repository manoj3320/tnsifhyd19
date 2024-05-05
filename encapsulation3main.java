package com.oop.encapsulation;

import com.oop.*;

public class encapsulation3main {
public static void main(String[] args) {
		
		encapsulation3 e3 = new encapsulation3();
		e3.setSubject("Science");
		e3.setReport("pass");
		e3.setGrade("C");
		e3.setMarks(80);
		
		System.out.println( e3.promote ());
	}
	
}
