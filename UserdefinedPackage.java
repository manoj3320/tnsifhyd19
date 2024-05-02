package com.tnssi.day3;

import com.tnssi.*;

class Two_wheelers {
 public void Bike() {
     System.out.println("Two_ wheeler - Bike");
 }
 
 public void Scooter() {
     System.out.println("Two_ wheeler - Scooter");
 }
 
 public void Bicycle() {
     System.out.println("Two_ wheeler - Bicycle");
 }
}
class Four_wheelers {
 public void Ambulance() {
     System.out.println("Four_wheelers - Ambulance");
 }
 
 public void Car() {
     System.out.println("Four_wheelers - Car");
 }
 
 public void Van() {
     System.out.println("Four_wheelers - Van");
 }
}
class Six_wheelers {
 public void Bus() {
     System.out.println("Six_wheelers - Bus");
 }
 
 public void Truck() {
     System.out.println("Six_wheelers - Truck");
 }
 
 public void Fireengine() {
     System.out.println("Six_wheelers - Fireengine");
 }
}
public class UserdefinedPackage {
	 public static void main(String[] args) {
		 Two_wheelers obj1 = new Two_wheelers();
	     obj1.Bike();
	     obj1.Scooter();
	     obj1.Bicycle();
	     
	     Four_wheelers obj2 = new Four_wheelers();
	     obj2.Ambulance();
	     obj2.Car();
	     obj2.Van();
	     
	     Six_wheelers obj3 = new Six_wheelers();
	     obj3.Bus();
	     obj3.Truck();
	     obj3.Fireengine();
	 }
	}


