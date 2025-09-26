package br.edu.ibmec.oop.assignments1.ex05.simplecalculator;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double number1 = sc.nextDouble();
		
		System.out.print("Enter the second number: ");
		double number2 = sc.nextDouble();
		
		System.out.print("Enter the operation: (+, -, *, /): ");
		char operation = sc.next().charAt(0); 
		
		double target = 0;
		boolean erro = false;
		
		switch (operation) {
		case '+':
			target = number1 + number2;
			break;
		case '-':
			target = number1 - number2;
			break;
		case '*':
			target = number1 * number2;
			break;
		case '/':
			
			if (number1 == 0 || number2 == 0) {
				
				System.out.println("Error: the number zero cannot participate in a division operation");
				sc.close();
				return;
			}
			target = number1 / number2;
			break;
			
		}
			System.out.println("The operation is" + operation + "The result is: " + target);	
	}
}
