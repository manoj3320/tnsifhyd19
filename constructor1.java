package com.oop.constructor;

// Default constructor 

public class constructor1 {

	private String subject;
	private String report;
	private String grade;
	public int marks;
	
	public constructor1() {
		
	subject = "Science" ;
	report = "pass" ;
	grade = "C" ;
	marks = 200 ;
	}
		
	public String promote() {
		if(subject == "Science" && report == "pass" && grade == "C" && marks>=60) {
			return "he/she is promoted to next class";
		}
		else {
			return "he/she is not promoted to next class & he/she stay in same class";
		}
	}
	
}
