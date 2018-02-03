package by.htp.jd01.unit2.hw02;

import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		double[] array;
		
		array = createArray();
		System.out.println("-----------------------");
		print(array);
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("Max = " + findMax(array));
		System.out.println("Min = " + array[findMinIndex(array)] + ", index = " + findMinIndex(array));
		selectionSort(array);
		System.out.println("-----------------------");
		System.out.println("Sorted array");
		print(array);
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
	
	public static double findMax(double[] array) {
		double max;
		
		max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		return max;
	}
	
	public static int findMinIndex(double[] array) {
		double min;
		int index = 0;
		
		min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				index = i;
			}
		}
		
		return index;
	}
	
	public static void print(double[] array) {
		System.out.print("array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%.3f] ", array[i]);
		}
	}
	
	public static void selectionSort(double[] array) {
		int min = 0;
		double temp = 0.0;
		
		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					min = j;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}

}
