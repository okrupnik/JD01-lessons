package by.htp.jd01.les02.hw09;

import java.util.Scanner;

public class HomeWork9 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double h = 0.0;
		double x;
		double f;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start point (a): ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter start point (a): ");
			sc.next();
		}
		a = sc.nextDouble();

		System.out.print("Enter end point (b): ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter end point (b): ");
			sc.next();
		}
		b = sc.nextDouble();

		System.out.print("Enter step (h): ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter step (h): ");
			sc.next();
		}
		h = sc.nextDouble();

		for(x = a; x <= b; x += h) {
			f = 2 * Math.tan(x / 2) + 1;
			System.out.println("x = " + x + "; f(x) = " + f + ";");
		}

	}

}
