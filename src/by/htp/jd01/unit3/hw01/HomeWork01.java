package by.htp.jd01.unit3.hw01;

import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		double[][] array;
		double[] arrayMax;

		array = createArray();
		System.out.println("-----------------------");
		printDoubleArray(array);
		System.out.println("-----------------------");
		arrayMax = findMaxColumn(array);
		printSingleArray(arrayMax);
		

	}

	public static double[][] createArray() {
		int number = 0;
		int size = 0;
		double[][] array = new double[size][size];

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

	public static double[][] createArrayManually(int size) {
		double[][] array = new double[size][size];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter element array[" + i + ", " + j + "] = ");
				array[i][j] = enterNumberManually();
			}
		}

		return array;
	}

	public static double enterNumberManually() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			System.out.print("Enter correct number of array:");
			sc.next();
		}
		return sc.nextDouble();
	}

	public static double[][] createArrayAutomatically(int size) {
		Random random = new Random();
		double[][] array = new double[size][size];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextDouble();
			}
		}
		return array;
	}

	public static void printDoubleArray(double[][] array) {
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%.2f] ", array[i][j]);
			}
			System.out.println();
		}
	}

	public static void printSingleArray(double[] array) {
		System.out.print("Array of maximum column values: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%.2f] ", array[i]);
		}
		System.out.println();
	}

	public static double[] findMaxColumn(double[][] array) {
		double[] maxArray = new double[array.length];
		double max = 0;

		for (int j = 0; j < array.length; j++) {
			max = array[0][j];
			for (int i = 0; i < array[j].length - 1; i++) {
				if (max < array[i + 1][j]) {
					max = array[i + 1][j];
				}
			}
			maxArray[j] = max;
		}

		return maxArray;
	}

}
