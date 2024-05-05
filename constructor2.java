package com.oop.constructor;

// Parametrized Constructor

public class constructor2 {

	private String subject;
	private String report;
	private String grade;
	public int marks;
	
	public constructor2 (String subject , String report , String grade , int marks) {
	
		this.subject = subject ;
		this.report = report ;
		this.grade = grade ;
		this.marks = marks ;
		
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
