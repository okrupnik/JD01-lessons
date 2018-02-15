package by.htp.jd01.unit4.hw02;

public class Abiturient extends Human {
	private int[] mark;
	private double avarageMark;

	public Abiturient(String surname, String name, int age, boolean isMale) {
		super(surname, name, age, isMale);
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}

	public double getAvarageMark() {
		return avarageMark;
	}

	public void setAvarageMark(double avarageMark) {
		this.avarageMark = avarageMark;
	}
	
}
