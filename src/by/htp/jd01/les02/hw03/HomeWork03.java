package by.htp.jd01.les02.hw03;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter a: ");
			sc.next();
		}
		a = sc.nextDouble();

		System.out.print("Enter b: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter b: ");
			sc.next();
		}
		b = sc.nextDouble();

		if (a > b) {
			System.out.print("Enter c: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter c: ");
				sc.next();
			}
			c = sc.nextDouble();
			System.out.println("b + c = " + (b + c));
		} else if (a < b) {
			System.out.print("Enter c: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter c: ");
				sc.next();
			}
			c = sc.nextDouble();
			System.out.println("a + b + c = " + (a + b + c) + " New Year!");
		} else {
			System.out.print("The end");
		}

	}

}
