package br.edu.ibmec.oop.assignments1.ex01.averagesalary;
import java.util.Scanner;

public class AverageSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		double[] salary = new double [3];
		double some = 0;
		
		for (int i=0; i<3; i++)
		{
			System.out.print("Enter the name: ");
			name[i] = sc.nextLine();
			
			System.out.print("Enter the salary: ");
			salary[i] = sc.nextDouble();
			sc.nextLine(); 
			
			some += salary[i];
		}
		
		for (int i=0; i<3; i++)
		{
			System.out.println("Name: " + name[i] + " Salary: " + salary[i]);
		}
		
		System.out.println("Average: " + some/3);
	}

}
