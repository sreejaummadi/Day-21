package com.codegnan.oopexamples;

public class Area_Calculator {
	double length;
	double width;
	double side;
	double base;
	double height;
	double radius;
	public double rectangleArea(double length, double width) {
		return length*width;
	}
	public double circleArea(double radius) {
		return 3.14*radius*radius;
	}
	public double squareArea(double side) {
		return side*side;
	}
	public static double triangleArea(double base,double height) {
		return 0.5*base*height;
	}
	public static double trapezoidArea(double base1,double base2,double height) {
		return 0.5*(base1+base2)+height;
	}
	public static double parallelogramArea(double base,double height) {
		return base*height;
	}
	public static void main(String[] args) {
		Area_Calculator a=new Area_Calculator();
		System.out.println("Area of Rectangle: "+a.rectangleArea(2, 4));
		System.out.println("Area of Circle: "+a.circleArea(5));
		System.out.println("Area of square"+a.squareArea(4));
		System.out.println("Area of Triangle"+triangleArea(5,6));
		System.out.println("Area of Trapezoid "+trapezoidArea(4,5,6));
		System.out.println("Area of paralleogram "+parallelogramArea(5,6));
		
	}
}
