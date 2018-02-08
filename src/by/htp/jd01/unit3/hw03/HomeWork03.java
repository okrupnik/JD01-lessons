package by.htp.jd01.unit3.hw03;

import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		double[][] array;
		double sum = 0.0;
		double product = 0.0;

		array = createArray();
		System.out.println("-----------------------");
		print(array);
		System.out.println("-----------------------");
		sum = sum(array);
		System.out.printf("Sum = %.2f", sum);
		System.out.println();
		System.out.println("-----------------------");
		product = (double)(product(array));
		System.out.printf("Product = %.2f", product);
		
		

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
				array[i][j] = random.nextDouble()*10;
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
	
	public static double sum(double[][] array) {
		double sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
			}
		}
		
		return sum;
	}
	
	public static double product(double[][] array) {
		double product = 1.0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				product = product * array[i][j];
			}
		}
		
		return product;
	}

}
