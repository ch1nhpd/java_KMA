package Buoi3;

public class Circle {
	double radius;
	String color;

	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
