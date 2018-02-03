package by.htp.jd01.unit2.hw033;

import java.util.Random;
import java.util.Scanner;

public class HomeWork033 {

	public static void main(String[] args) {
		double[] array;

		array = createArray();
		System.out.println("-----------------------");
		print(array);
		System.out.println();
		System.out.println("-----------------------");
		test(array);

	}

	public static double[] createArray() {
		int number = 0;
		int size = 0;
		double[] array = new double[size];

		number = choiceCreation();

		size = sizeArray();

		if (number == 1) {
			array = createArrayManually(size);
		} else if (number == 2) {
			array = createArrayAutomatically(size);
		}
		return array;
	}

	public static int choiceCreation() {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("-----------------------");
		System.out.println("How do you want to create array?");
		System.out.println("If you want to create an array manually - press 1,");
		System.out.println("if you want to create an array automatically  - press 2?");

		do {
			System.out.print("Enter correct number:");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct number:");
				sc.next();
			}
			number = sc.nextInt();
		} while ((number <= 0) || (number >= 3));

		return number;
	}

	public static int sizeArray() {
		Scanner sc = new Scanner(System.in);
		int size = 0;

		do {
			System.out.print("Enter correct size array:");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct size array:");
				sc.next();
			}
			size = sc.nextInt();
		} while (size <= 0);

		return size;
	}

	public static double[] createArrayManually(int size) {
		double[] array = new double[size];

		for (int i = 0; i < size; i++) {
			array[i] = enterNumberManually();
		}

		return array;
	}

	public static double enterNumberManually() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of array:");
		while (!sc.hasNextDouble()) {
			System.out.print("Enter correct number of array:");
			sc.next();
		}
		return sc.nextDouble();
	}

	public static double[] createArrayAutomatically(int size) {
		Random random = new Random();
		double[] array = new double[size];

		for (int i = 0; i < size; i++) {
			array[i] = random.nextDouble();
		}
		return array;
	}

	public static void test(double[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i-1] > array[i]) {
				System.out.println("The sequence isn't increasing");
				return;
			}
		}
		System.out.println("The sequence is increasing");
		return;
	}

	public static void print(double[] array) {
		System.out.print("array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%.3f] ", array[i]);
		}
	}

}
