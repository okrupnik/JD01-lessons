package by.htp.jd01.les02.hw05;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		int number;
		int n;
		int counter_even = 0;
		int sum_multiply = 0;
		int counter_mod = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter number: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter number: ");
				sc.next();
			}
			number = sc.nextInt();
		} while (number <= 0);

		for (int i = 0; i < number; i++) {
			System.out.print("Enter n: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter n: ");
				sc.next();
			}
			n = sc.nextInt();
			if ((n % 2) == 0) {
				counter_even++;
			}
			if ((n % 3) == 0) {
				sum_multiply += n;
			}
			if (Math.abs(n) < 3) {
				counter_mod++;
			}
		}

		System.out.println("Even number: " + counter_even);
		System.out.println("Sum: " + sum_multiply);
		System.out.println("Mod number: " + counter_mod);
	}

}
