package by.htp.jd01.unit4.hw03;

public class Note {
	private int id = 0;
	private String surname = null;
	private String name = null;
	private String address = null;
	private String phoneNumber = null;

	public Note(int id, String surname, String name, String address, String phoneNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Note note = (Note) obj;
		if (this.id != note.id) {
			return false;
		}

		if (this.surname == null) {
			if (note.surname != null) {
				return false;
			}
		} else {
			if (!this.surname.equals(note.surname)) {
				return false;
			}
		}

		if (this.name == null) {
			if (note.name != null) {
				return false;
			}
		} else {
			if (!this.name.equals(note.name)) {
				return false;
			}
		}

		if (this.address == null) {
			if (note.address != null) {
				return false;
			}
		} else {
			if (!this.address.equals(note.address)) {
				return false;
			}
		}

		if (this.phoneNumber == null) {
			if (note.phoneNumber != null) {
				return false;
			}
		} else {
			if (!this.phoneNumber.equals(note.phoneNumber)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		//System.out.println(surname + " " + name + ", address: " + address + ", phoneNumber: " + phoneNumber);
		return surname + " " + name + ", address: " + address + ", phoneNumber: " + phoneNumber;
	}

	
}
