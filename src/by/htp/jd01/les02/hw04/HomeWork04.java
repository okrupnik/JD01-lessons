package by.htp.jd01.les02.hw04;

import java.util.Scanner;

public class HomeWork04 {

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

		if (a == b) {
			System.out.print("Soon New Year!");
		} else {
			System.out.print("Enter c: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter c: ");
				sc.next();
			}
			c = sc.nextDouble();
			System.out.println("a + b + c = " + (a + b + c));
			System.out.println("a^2 + b^2 = " + (Math.pow(a, 2) + Math.pow(b, 2)));
			System.out.println("Arsenal");
		}

	}

}
