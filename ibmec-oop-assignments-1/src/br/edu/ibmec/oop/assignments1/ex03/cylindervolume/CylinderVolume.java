package br.edu.ibmec.oop.assignments1.ex03.cylindervolume;
import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double radius = sc.nextDouble();
		
		System.out.println("Enter de height: ");
		double height = sc.nextDouble();
		
		double area = 2 * Math.PI * radius * (radius + height);
		double volume = Math.PI * Math.pow(radius, 2) * height;
		
		System.out.printf("Area: " + area + " \nvolume: " + volume);
		
		sc.close();
	}

}
