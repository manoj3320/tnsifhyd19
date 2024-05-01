package com.tnssi.day3;

import java.awt.*;

class Event{
	public void KeyEvent() {
		System.out.println("An event that occurs due to a sequence of keypresses on the keyboard.");
	}
	public void MouseEvent() {
		System.out.println("The events that occur due to the user interaction with the mouse.");
	}
	public void TextEvent() {
		System.out.println("An event that occurs when an object’s text changes.");
	}
	
}
class Color{
	public void getBlue() {
		System.out.println("Blue is the color of honesty, stability, and calmness . It returns the blue component in the range 0-255 .");
	}
	public void getRed() {
		System.out.println("Red is the color of passion, energy, danger and action .It returns the red component in the range 0-255 in the default sRGB space.");
	}
	public void getGreen() {
		System.out.println("Green is the color of life, nature, and growth . It returns the green component in the range 0-255 in the default sRGB space.");	
	}
	
}
class Font{
	public void getAttributes(){
		System.out.println("It returns a map of font attributes available in this Font.");
	}
	public void canDisplay(){
		System.out.println("It checks if this Font has a glyph for the specified data.");
	}
	public void deriveFont(){
		System.out.println("It creates a new Font object by replicating the current Font object like size, style,transform.");
	}
}

public class BuiltinPackage2 {

	public static void main(String[] args) {
		
		Event e1 = new Event();
		e1.KeyEvent();
		e1.MouseEvent();
		e1.TextEvent();
		
		Color c1 = new Color();
		c1.getBlue();
		c1.getRed();
		c1.getGreen();
		
		Font f1 = new Font();
		f1.getAttributes();
		f1.canDisplay();
		f1.deriveFont();
		
	}

}
