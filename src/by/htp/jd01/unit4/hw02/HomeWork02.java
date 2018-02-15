package by.htp.jd01.unit4.hw02;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		int amountAbiturient;
		int numberPlace;
		
		amountAbiturient = manager.enterNumber("Enter the number of abiturienrov - ");
		manager.initAbiturient(amountAbiturient);

		manager.showAbiturient();

		System.out.println("______________________________________________");
		System.out.println();
		System.out.println("**********************************************");
		System.out.println("______________________________________________");

		numberPlace = manager.enterNumber("Enter the number of places - ");
		manager.receivedAbiturient(numberPlace);
	}

}
