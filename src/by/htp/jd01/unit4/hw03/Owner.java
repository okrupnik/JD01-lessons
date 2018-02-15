package by.htp.jd01.unit4.hw03;

public class Owner {
	private String surname;
	private String name;
	private String phoneNumber;
	
	public Owner(String surname, String name, String phoneNumber) {
		this.surname = surname;
		this.name = name;
		this.phoneNumber = phoneNumber;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
