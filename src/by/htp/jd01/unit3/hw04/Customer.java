package by.htp.jd01.unit3.hw04;


class Customer {
	private int id;
	private String surname;
	private String name;
	private String lastname;
	private String address;
	private String numberCreditCard;
	private int numberBankAccount;

	public Customer(int id, String surname, String name, String lastname, String address, String numberCreditCard,
			int numberBankAccount) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.lastname = lastname;
		this.address = address;
		this.numberCreditCard = numberCreditCard;
		this.numberBankAccount = numberBankAccount;
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

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setNumberCreditCard(String numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public String getNumberCreditCard() {
		return this.numberCreditCard;
	}

	public void setNumberBankAccount(int numberBankAccount) {
		this.numberBankAccount = numberBankAccount;
	}

	public int getNumberBankAccount() {
		return this.numberBankAccount;
	}

	public void show() {
		System.out.println("Customer: " + getSurname() + " " + getName() + " " + getLastname());
		System.out.println("His address: " + getAddress());
		System.out.println("His bank account number: " + getNumberBankAccount() + " and his credit card number: "
				+ getNumberCreditCard());
	}

	public void change(String address, String cardNumber) {
		setAddress(address);
		setNumberCreditCard(cardNumber);
	}
}
