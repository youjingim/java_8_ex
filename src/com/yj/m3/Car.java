package com.yj.m3;

public class Car {
	String color;
	String brand;
	int cc;
	
	public Car() {
		color = "red";
		brand = "Audi";
		cc=3000;
	}
	public Car(String c) {
		color = c;
		brand = "Audi";
		cc=3000;
	}
	public Car(String c, String b) {
		color = c;
		brand = b;
		cc=3000;
	}
	public Car(String c, String b,int cc1) {
		color = c;
		brand = b;
		cc=cc1;
	}
	
	public void info() {
		System.out.println(color);
		System.out.println(brand);
		System.out.println(cc);
	}

}
