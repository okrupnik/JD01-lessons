package by.htp.jd01.unit4.hw03;

public class Note implements Cloneable, Comparable<Note> {
	private String text;
	private Date date;
	private Boolean isActual;

	public Note() {

	}

	public Note(String text, Date date, Boolean isActual) {
		this.text = text;
		this.date = date;
		this.isActual = isActual;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getIsActual() {
		return isActual;
	}

	public void setIsActual(Boolean isActual) {
		this.isActual = isActual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((isActual == null) ? 0 : isActual.hashCode());
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
		if (isActual == null) {
			if (other.isActual != null)
				return false;
		} else if (!isActual.equals(other.isActual))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Note obj = null;
		obj = (Note) super.clone();

		if (this.date != null) {
			obj.date = (Date) this.date.clone();
		}
		return obj;
	}

	@Override
	public int compareTo(Note arg0) {
		int yearCurrent = this.date.getYear();
		int yearNext = arg0.getDate().getYear();

		if (yearCurrent > yearNext) {
			return 1;
		}
		if (yearCurrent < yearNext) {
			return -1;
		}

			return 0;
	}

}
