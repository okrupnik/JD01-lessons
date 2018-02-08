package by.htp.jd01.unit3.hw06;

import java.util.Scanner;

public class Additional {

	public static void main(String[] args) {
		double x = 0;
		double y = 0;

		x = enterNumber("x");
		y = enterNumber("y");

		System.out.printf("x = %.2f; ", x);
		System.out.printf("y = %.2f", y);

		belong(x, y);

	}

	public static double enterNumber(String message) {
		double number = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter coordinate " + message + " = ");
		while (!sc.hasNextDouble()) {
			System.out.print("Entered " + message + " incorrect, try to enter again = ");
			sc.next();
		}
		return sc.nextDouble();
	}

	public static void belong(double x, double y) {
		if (((x >= -2) && (y <= 4) && (x <= 2) && (y >= 0)) || ((x >= -4) && (y <= 0) && (x <= 4) && (y >= -3))) {
			System.out.println(" = true, the entered point belong our area");
		} else {
			System.out.println(" = false, the entered point don't belong our area");
		}
	}
}
