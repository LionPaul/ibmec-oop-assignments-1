package br.edu.ibmec.oop.assignments1.ex08.miniacademicsystem;
import java.util.Scanner;

public class MiniSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		
		while (continuar) {
			System.out.print("Enter the Name: ");
			String name = sc.nextLine();
			System.out.print("Enter the Registration: ");
			int registration = sc.nextInt(); 
			System.out.print("Firt Value: ");
			double testOne = sc.nextDouble();
			System.out.print("Second Value: ");
			double testTwo = sc.nextDouble();
			System.out.print("Complemetary: ");
			double complementaryTest = sc.nextDouble();
			
			testOne *= 4;
			testTwo *= 4;
			complementaryTest *= 2;
			
			double avg = testOne + testTwo + complementaryTest;
			avg /= 10;
			
			if (avg < 7)
			{
				double bigger = 0;
				double smaller = 0;
				if (testOne>testTwo)
				{
					bigger = testOne;
					smaller = testTwo;
				}
				else if (testOne<testTwo)
				{
					bigger = testTwo;
					smaller = testOne;
				}
				else 
				{
					bigger = testOne;
					smaller = testTwo;
				}
				System.out.print("Enter the AS:");
				double as = sc.nextDouble();
				
				smaller = as;
				smaller = smaller * 4;
				 avg = bigger + smaller + complementaryTest;
				 avg /= 10;
				 
				 if (avg < 7) {
				 System.out.println("Student: " + name + "\nRegister: " + registration + "\n Average: " + avg + "Reprovado");
				 }
				 else 
				 {
					 System.out.println("Student: " + name + "\nRegister: " + registration + "\n Average: " + avg + "Aprovado");
				 }
			}
			else 
			{
				System.out.println("Student: " + name + "\nRegister: " + registration + "\n Average: " + avg + "Aprovado");
			}
			
			
			System.out.print("Quer continuar? Digite true para sim e false para não");
			continuar = sc.nextBoolean();
			sc.nextLine();
			
		}

	}

}
