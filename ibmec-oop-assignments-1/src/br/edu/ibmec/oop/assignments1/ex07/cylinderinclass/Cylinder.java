package br.edu.ibmec.oop.assignments1.ex07.cylinderinclass;

public class Cylinder {
private double radius; 
private double height;

public Cylinder (double radius, double height) {
	this.radius = radius;
	this.height = height;
	}

public double calculateArea() {
	return 2 * Math.PI * radius * (radius * height);
}

public double calculateVolume() {
	return Math.PI * Math.pow(radius, 2) * height;
}


public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}


}
