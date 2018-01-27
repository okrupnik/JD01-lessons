package by.htp.jd01.les02.hw07;

import java.util.Scanner;

public class HomeWork07 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double rez;

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

		do {
			System.out.print("Enter c more than 0: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter c more than 0: ");
				sc.next();
			}
			c = sc.nextDouble();
		} while (c <= 0);

		do {
			System.out.print("Enter d more than 0: ");
			while (!sc.hasNextDouble()) {
				System.out.print("Enter d more than 0: ");
				sc.next();
			}
			d = sc.nextDouble();
		} while (d <= 0);

		rez = ((a / c) * (b / d)) - (((a * b) - c) / (c * d));

		System.out.print("rez: " + rez);

	}

}
