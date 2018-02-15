package by.htp.jd01.unit4.hw01;

public class Group {
	private String name;
	private Student[] students;

	public Group(String name, Student... students) {
		this.name = name;
		this.students = students;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public double getAvarageGroupScore() {
		double sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum = sum + students[i].getAvarageStudentScore();
		}

		return (sum / students.length);
	}

	public int getAmountExcellentStudent() {
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			if (students[i].getAvarageStudentScore() >= 4.8) {
				count++;
			}
		}

		return count;
	}

	public int getAmountBadStudent() {
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].getMark().length; j++) {
				if ((students[i].getMark()[j]) == 2) {
					count++;
					break;
				}
			}
		}

		return count;
	}

}
