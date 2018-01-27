package by.htp.jd01.les02.hw02;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double rez;

		Scanner sc = new Scanner(System.in);

			System.out.print("Enter first katet: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter first katet: ");
				sc.next();
			}
			a = sc.nextDouble();
		
			System.out.print("Enter second katet: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter second katet: ");
				sc.next();
			}
			b = sc.nextDouble();
		
			System.out.print("Enter c: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter c: ");
				sc.next();
			}
			c = sc.nextDouble();

		rez = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);

		System.out.println("Result: " + rez);
	}

}
