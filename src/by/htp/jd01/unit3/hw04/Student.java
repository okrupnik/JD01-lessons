package by.htp.jd01.unit3.hw04;

import java.sql.Date;

public class Student {
	private int id;
	private String surname;
	private String name;
	private String lastname;
	private Date date;
	private String address;
	private String phoneNumber;
	private String faculty;
	private int course;

	public Student(int id, String surname, String name, String lastname, Date date, String address, String phoneNumber,
			String faculty, int course) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.lastname = lastname;
		this.date = date;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.faculty = faculty;
		this.course = course;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDate() {
		return this.date;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFaculty() {
		return this.faculty;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getCourse() {
		return this.course;
	}

	public void show() {
		System.out.println("Student: " + getSurname() + " " + getName() + " " + getLastname());
		System.out.println("Date birthday: " + getDate());
		System.out.println("His address: " + getAddress());
		System.out.println("Phone number: " + getPhoneNumber());
		System.out.println("He is studying at the faculty of: " + getFaculty() + " on the " + getCourse() + " course");

	}

	public void change(String phoneNumber, int course) {
		setPhoneNumber(phoneNumber);
		setCourse(course);
	}
}

