package by.htp.jd01.les02.hw01;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		double a = 0.0;
		double b = 0.0;
		double c;
		double s;

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

		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		s = (a * b) / 2;
		
		System.out.println("Gipotenuza: " + c);
		System.out.println("Square: " + s);

	}

}
