package by.htp.jd01.les02.hw10;

import java.util.Scanner;

public class HomeWork10 {

	public static void main(String[] args) {
		double x = 0.0;		
		double rez;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x: ");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter x: ");
			sc.next();
		}
		x = sc.nextDouble();
		
		if (x <= -3) {
			rez = 9;
			System.out.println("f(x) = " + rez);
		} else if (x > 3) {
			rez = 1 / (Math.pow(x, 2) + 1);
			System.out.println("f(x) = " + rez);
		} else {
			System.out.println("the function can't be calculated");
		}

	}

}
