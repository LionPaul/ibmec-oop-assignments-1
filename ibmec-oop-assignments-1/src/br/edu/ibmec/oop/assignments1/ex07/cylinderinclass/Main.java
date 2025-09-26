package br.edu.ibmec.oop.assignments1.ex07.cylinderinclass;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Radius: ");
		double radius = sc.nextDouble();
		
		System.out.print("Enter the height");
		double height = sc.nextDouble();
		
		Cylinder cylinder = new Cylinder(radius, height);
		
		System.out.println("Radius: " + radius + "Height: " + height);
		System.out.println("Area: " + cylinder.calculateArea());
		System.out.println("Volume: " + cylinder.calculateVolume());
		
		sc.close();
	}

}
