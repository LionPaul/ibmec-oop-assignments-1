package br.edu.ibmec.oop.assignments1.ex06.pixtransfer;
import java.util.Scanner;

public class PixTransfer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String correctpassword = "J@vaPOO";
		boolean autentificator = false;
		double originalbalance = 1000;
		double pixlimit = 500;
		double targetbalance = 2000;
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter the password: ");
			String trypassword = sc.nextLine();
				if (trypassword.equals(correctpassword)) {
					autentificator = true;
					i = 3;
				}
			}
		if (autentificator == false) {
			System.out.print("System Blocked");
			sc.close();
			return;
		}
		
		System.out.println("Enter the pix key: ");
		String pixkey = sc.nextLine();
		System.out.println("Enter the Amount to be transferred ");
		double tranferred = sc.nextDouble();
		
		boolean validation = true;
		
		if (tranferred > pixlimit || tranferred > originalbalance) {
			validation = false;
		}
		
		if (validation == true) {
			originalbalance = originalbalance - tranferred;
			targetbalance = targetbalance + tranferred;
		}
		
		System.out.println("Validation Status: " + validation + "Pix Amount: " + tranferred + "Original balance: " + originalbalance + "Target balance: " + targetbalance);
		sc.close();
		
	}

}
