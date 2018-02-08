package by.htp.jd01.unit3.hw02;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		double[][] array;

		array = createArray();
		System.out.println("-----------------------");
		print(array);
		System.out.println("-----------------------");
		modifiedArray(array);
		System.out.print("Modified ");
		print(array);
	}

	public static double[][] createArray() {
		int number = 0;
		double[][] array = null;

		number = choiceCreation();

		if (number == 1) {
			array = createArrayManually();
		} else if (number == 2) {
			array = createArrayAutomatically();
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

	public static double[][] createArrayManually() {
		int row = 0;
		int column = 0;

		row = enterRow();
		column = enterColumn();

		double[][] array = new double[row][column];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("Enter element array[" + i + ", " + j + "] = ");
				array[i][j] = enterNumberManually();
			}
		}

		return array;
	}

	public static int enterRow() {
		Scanner sc = new Scanner(System.in);
		int row = 0;

		do {
			System.out.print("Enter correct amount lines: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct amount lines:");
				sc.next();
			}
			row = sc.nextInt();
		} while (row <= 0);

		return row;
	}

	public static int enterColumn() {
		Scanner sc = new Scanner(System.in);
		int column = 0;

		do {
			System.out.print("Enter correct amount columns: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct amount columns:");
				sc.next();
			}
			column = sc.nextInt();
		} while (column <= 0);

		return column;
	}

	public static double enterNumberManually() {
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			System.out.print("Enter correct number of array:");
			sc.next();
		}
		return sc.nextDouble();
	}

	public static double[][] createArrayAutomatically() {
		Random random = new Random();
		int row = 0;
		int column = 0;

		row = enterRow();
		column = enterColumn();

		double[][] array = new double[row][column];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextDouble();
			}
		}
		return array;
	}

	public static void print(double[][] array) {
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("[%.2f] ", array[i][j]);
			}
			System.out.println();
		}
	}

	public static void modifiedArray(double[][] array) {
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 0;

		do {
			System.out.print("Enter correct first line: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct first line:");
				sc.next();
			}
			first = sc.nextInt();
		} while ((first < 0) || (first > array.length));

		do {
			System.out.print("Enter correct second line: ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct second line:");
				sc.next();
			}
			second = sc.nextInt();
		} while ((second < 0) || (second > array.length));

		double[] temp = array[first-1];
		array[first-1] = array[second-1];
		array[second-1] = temp;
	}

}
