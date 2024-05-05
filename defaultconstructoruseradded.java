package com.oop.constructor;

public class defaultconstructoruseradded {
	
	private String color;
	
	public defaultconstructoruseradded( String icolor) {
		
		color = icolor;
		
	}

	public String getColor() {
		
		return color;

	}
	
	public static void main(String[] args) {
		
		defaultconstructoruseradded dc = new defaultconstructoruseradded("BLACK");
		System.out.println( dc.getColor());
	}

}
