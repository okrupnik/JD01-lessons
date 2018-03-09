package by.htp.jd01.unit6.entity;

import java.util.Calendar;

public class Note {
	private int idNote;
	private int idUser;
	private Calendar date;// GregorianCalendar
	private String text;
	
	public Note() {	
	}

	public Note(int idUser, Calendar date, String text) {
		this.idNote = ++this.idNote;
		this.idUser = idUser;
		this.date = date;
		this.text = text;
	}

	public int getIdNote() {
		return idNote;
	}

	public int getIdUser() {
		return idUser;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + idUser;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (idUser != other.idUser)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Note{" +
				"idUser=" + idUser +
				", date=" + date.get(Calendar.DATE) + "/" + (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.YEAR) +
				", text='" + text + '\'' +
				'}';
	}
}
