package by.htp.jd01.unit2.hw032;

import java.util.Random;
import java.util.Scanner;

public class HomeWork032 {

	public static void main(String[] args) {
		int[] array;
		int[] array2;
	
		array = createArray();
		System.out.println("-----------------------");
		print(array);
		System.out.println();
		System.out.println("-----------------------");
		array2 = createNewArray(array);
		System.out.print("New ");
		print(array2);
	}

	public static int[] createArray() {
		int number = 0;
		int size = 0;
		int[] array = new int[size];

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

	public static int[] createArrayManually(int size) {
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = enterNumberManually();
		}

		return array;
	}

	public static int enterNumberManually() {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.print("Enter number of array:");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter correct number of array:");
				sc.next();
			}
			number = sc.nextInt();
		} while (number < 0);

		return number;
	}

	public static int[] createArrayAutomatically(int size) {
		Random random = new Random();
		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = random.nextInt(1000);
		}
		return array;
	}

	public static int[] createNewArray(int[] array) {
		int[] newArray;
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				count++;
			}
		}

		newArray = new int[count];
		count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				newArray[count] = i + 1;
				count++;
			}
		}

		return newArray;
	}

	public static void print(int[] array) {
		System.out.print("array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("[%-4d] ", array[i]);
		}
	}
}
