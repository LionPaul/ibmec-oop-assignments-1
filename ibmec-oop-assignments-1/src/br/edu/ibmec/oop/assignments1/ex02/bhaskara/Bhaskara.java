package br.edu.ibmec.oop.assignments1.ex02.bhaskara;
import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter b: ");
		double b = sc.nextDouble(); 
		
		System.out.print("Enter c: ");
		double c = sc.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		System.out.println("/nValues: ");
		System.out.println("a = " + a + "b = " + b + "c = " + c);
		System.out.println("Delta: " + delta);
		
		if (delta < 0) {
			System.out.println("There are no real roots for these values");
		}
		else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		sc.close();
		
	}
}