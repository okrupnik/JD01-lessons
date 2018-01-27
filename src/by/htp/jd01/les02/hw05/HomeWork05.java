package by.htp.jd01.les02.hw05;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		int number;
		int n;
		int counterEven = 0;
		int sumMultiply = 0;
		int counterMod = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Enter amount of numbers: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter amount of numbers: ");
				sc.next();
			}
			number = sc.nextInt();
		} while (number <= 0);

		for (int i = 0; i < number; i++) {
			System.out.print("Enter number: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter number: ");
				sc.next();
			}
			n = sc.nextInt();
			if ((n % 2) == 0) {
				counterEven++;
			}
			if ((n % 3) == 0) {
				sumMultiply += n;
			}
			if (Math.abs(n) < 3) {
				counterMod++;
			}
		}

		System.out.println("Even number: " + counterEven);
		System.out.println("Sum: " + sumMultiply);
		System.out.println("Mod number: " + counterMod);
	}

}
