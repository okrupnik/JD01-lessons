package by.htp.jd01.unit4.hw01;

public abstract class Human {
	private String surname;
	private String name;
	private int age;
	private boolean isMale;
	
	public Human(String surname, String name, int age, boolean isMale) {
		this.surname = surname;
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	

}
