package br.edu.ibmec.oop.assignments1.ex04.academicsystem;
import java.util.Scanner;

public class AcademicSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the first test: ");
		double test1 = sc.nextDouble();
		
		System.out.print("Enter the second test: ");
		double test2 = sc.nextDouble();
		
		System.out.print("Enter the academic attendance: ");
		int attendance = sc.nextInt();
		
		double average = (test1 + test2)/2;
		
		if (30>attendance) {
			System.out.print(name + "\n" + average + "\n" + "You Fail");
			sc.close();
			return;
		}
		
		else if (average < 7) {
			System.out.print(name + "\n" + average + "\n" + "You Fail");
			sc.close();
			return;
		}
		else {
			System.out.print(name + "\n" + average + "\n" + "You Pass");
			sc.close();
			return;
	
		}
		
		
	}

}
