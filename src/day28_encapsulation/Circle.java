package day28_encapsulation;

public class Circle {
//instance variable//
	//radius,diamater,area,perimeter
	
	private double radius;
	private double diameter;
	private double area;
	private double perimeter;
	
	final double PI=3.14;
	
	
	//create getter//
	public double getRadius() {
		return this.radius;
	}
	
	
	
	//creat method to set redius//
	public void setRadious(double radius) {
		this.radius=radius;
	}
	
	
	//geter for diameter
	public double getDiameter() {
		return this.diameter;
	}
	
	public void setDiameter(double diameter) {
		this.diameter=diameter;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public void setArea(double diameter) {
		this.diameter=diameter;
	}
	
	public Circle(double radius) {
		 
		this.radius = radius;
		this.diameter = radius*2;
		this.area=calculatorArea(radius);
	}
	
	
	public double calculatorArea(double radius) {
		 return radius * radius * PI;
		 
		
	}
	
	
	
	
	
	
	
	
	
}
