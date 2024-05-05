package com.oop.encapsulation;

public class encapsulation3 {

	private String subject;
	private String report;
	private String grade;
	private int marks;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
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
