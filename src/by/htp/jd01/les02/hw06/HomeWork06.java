package by.htp.jd01.les02.hw06;

import java.util.Scanner;

public class HomeWork06 {

	public static void main(String[] args) {
		int number;
		double n;
		int counterEven = 0;
		int counterMore = 0;
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
			while (!sc.hasNextDouble()) {
				System.out.print("Enter number: ");
				sc.next();
			}
			n = (int) (sc.nextDouble());
			
			if ((n % 2) == 0) {
				counterEven++;
			} if (n > 15) {
				counterMore++;
			}
		}
		
		System.out.println("Even number: " + counterEven);
		System.out.println("Numbers more, than 15: " + counterMore);

	}

}
