package br.edu.ibmec.oop.assignments1.ex1.averagesalary;

import java.util.Scanner;

public class AverageSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		double[] salary = new double[3];
		double target = 0;
		
		for (int i=0; i<3; i++) {
			System.out.print("Enter the value " + name[i] + ":");
			salary[i] = sc.nextDouble();
			sc.nextLine();
			
			target += salary[i];
		}
		
		for (int i = 0; i < 3;  i++) {
			
		}
	}

}