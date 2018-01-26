package by.htp.jd01.les02.hw08;

import java.util.Scanner;

public class HomeWork08 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double positive;
		double negative;

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

		System.out.print("Enter c: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter c: ");
			sc.next();
		}
		c = sc.nextDouble();

		if (a >= 0) {
			negative = Math.pow(a, 2);
			System.out.println("a = " + negative);
		} else {
			positive = Math.pow(a, 4);
			System.out.println("a = " + positive);
		}

		if (b >= 0) {
			negative = Math.pow(b, 2);
			System.out.println("b = " + negative);
		} else {
			positive = Math.pow(b, 4);
			System.out.println("b = " + positive);
		}
		
		if (c >= 0) {
			negative = Math.pow(c, 2);
			System.out.println("c = " + negative);
		} else {
			positive = Math.pow(c, 4);
			System.out.println("c = " + positive);
		}

	}

}
