package by.htp.jd01.unit3.hw05;

import java.util.Random;

public class HomeWork05 {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(1, 2);
		Fraction fr2 = new Fraction(5, 7);
		Logic logic = new Logic();
		
		logic.print(fr1);
		logic.print(fr2);
		
		System.out.println();
		
		System.out.println("---Add fractions---");
		Fraction fr3 = logic.add(fr1, fr2);
		logic.print(fr3);
		System.out.println();
		
		System.out.println("---Substruct fractions---");
		fr3 = logic.subtract(fr1, fr2);
		logic.print(fr3);
		System.out.println();
		
		System.out.println("---Multiply fractions---");
		fr3 = logic.multiply(fr1, fr2);
		logic.print(fr3);
		System.out.println();
		
		System.out.println("---Divide fractions---");
		fr3 = logic.divide(fr1, fr2);
		logic.print(fr3);
		System.out.println();
		
		Random random = new Random();
		Fraction[] arrayFraction = new Fraction[random.nextInt(10) + 1];
		
		for(int i = 0; i < arrayFraction.length; i++) {
			arrayFraction[i] = new Fraction(random.nextInt(50), (random.nextInt(50) + 1));
		}
		
		System.out.println("---Array fractions---");
		for(int i = 0; i < arrayFraction.length; i++) {
			System.out.print((i + 1) + ": "  );
			logic.print(arrayFraction[i]);
			System.out.println();
		}

	}

}
