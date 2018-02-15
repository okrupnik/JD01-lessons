package by.htp.jd01.unit3.hw05;

public class Logic {

	public Fraction add(Fraction fraction, Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = fraction.getDenominator() * fraction2.getDenominator();
		newNumerator = fraction.getNumerator() * fraction2.getDenominator()
				+ fraction2.getNumerator() * fraction.getDenominator();
		
		Fraction fraction3 = new Fraction(newNumerator, newDenominator);
		reduce(fraction3);
		return fraction3;
	}
	
	public Fraction subtract(Fraction fraction, Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = fraction.getDenominator() * fraction2.getDenominator();
		newNumerator = fraction.getNumerator() * fraction2.getDenominator()
				- fraction2.getNumerator() * fraction.getDenominator();
		
		Fraction fraction3 = new Fraction(newNumerator, newDenominator);
		reduce(fraction3);
		return fraction3;
	}
	
	public Fraction multiply(Fraction fraction, Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = fraction.getDenominator() * fraction2.getDenominator();
		newNumerator = fraction.getNumerator() * fraction2.getNumerator();
		
		Fraction fraction3 = new Fraction(newNumerator, newDenominator);
		reduce(fraction3);
		return fraction3;
	}
	
	public Fraction divide(Fraction fraction, Fraction fraction2) {
		int newNumerator;
		int newDenominator;

		newDenominator = fraction.getDenominator() * fraction2.getNumerator();
		newNumerator = fraction.getNumerator() * fraction2.getDenominator();
		
		Fraction fraction3 = new Fraction(newNumerator, newDenominator);
		reduce(fraction3);
		return fraction3;
	}

	public void reduce(Fraction fraction) {
		int nod;

		if (fraction.getNumerator() > fraction.getDenominator()) {
			nod = fraction.getNumerator();
		} else {
			nod = fraction.getDenominator();
		}

		while (!((fraction.getNumerator() % nod == 0) && (fraction.getDenominator() % nod == 0))) {
			nod--;
		}

		fraction.setNumerator(fraction.getNumerator() / nod);
		fraction.setDenominator(fraction.getDenominator() / nod);
	}
	
	public void print(Fraction fraction) {
		System.out.println("fraction = " + fraction.getNumerator() + "/" + fraction.getDenominator());
	}

}
