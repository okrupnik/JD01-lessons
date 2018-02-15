package by.htp.jd01.unit4.hw01;

import java.sql.Date;

public class Student extends Human {
	private int[] mark;

	public Student(String surname, String name, int age, boolean isMale, int... mark) {
		super(surname, name, age, isMale);
		this.mark = mark;
	}

	public double getAvarageStudentScore() {
		double sum = 0;

		for (int i = 0; i < mark.length; i++) {
			sum = sum + mark[i];
		}

		return (sum / mark.length);
	}

	public int[] getMark() {
		return mark;
	}

	public void setMark(int[] mark) {
		this.mark = mark;
	}
	
	

}
