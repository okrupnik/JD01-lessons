package by.htp.jd01.unit4.hw01;

public class HomeWork01 {

	public static void main(String[] args) {
		Student student1 = new Student("Pupkin", "Vasya", 19, true, 5, 4, 5, 5);
		Student student2 = new Student("Ivanov", "Petya", 20, true, 5, 4, 2, 5);
		Student student3 = new Student("Petrova", "Sveta", 21, false, 5, 5, 5, 5);
		Student student4 = new Student("Sidorov", "Dima", 19, true, 2, 2, 2, 2);
		Student student5 = new Student("Klim", "Nadya", 20, false, 3, 4, 5, 5);
		Student student6 = new Student("Nagorny", "Vitalya", 22, true, 3, 4, 3, 5);
		Student student7 = new Student("Ermolaeva", "Katya", 20, true, 2, 2, 2, 2);

		Student student8 = new Student("Zeleny", "Sergey", 21, true, 5, 4, 2, 5);
		Student student9 = new Student("Krasochkina", "Dasha", 19, false, 5, 5, 5, 5);
		Student student10 = new Student("Nikolenko", "Sasha", 20, true, 5, 4, 5, 3);

		Group group1 = new Group("IT-113", student1, student2, student3, student4, student5, student6, student7);
		Group group2 = new Group("FM-57", student8, student9, student10);

		System.out.printf("Avarage group score " + group1.getName() + " = %.2f;", group1.getAvarageGroupScore());
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("Avarage score every student of group " + group1.getName() + ": ");
		for (int i = 0; i < group1.getStudents().length; i++) {
			System.out.printf(
					group1.getStudents()[i].getSurname() + " " + group1.getStudents()[i].getName() + " - %.2f",
					group1.getStudents()[i].getAvarageStudentScore());
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		System.out.println("Excelent students = " + group1.getAmountExcellentStudent());
		System.out.println("----------------------------------------------");
		System.out.println("Bad students = " + group1.getAmountBadStudent());

		System.out.println("----------------------------------------------");
		System.out.println("**********************************************");
		System.out.println("----------------------------------------------");

		System.out.printf("Avarage group score " + group2.getName() + " = %.2f;", group2.getAvarageGroupScore());
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println("Avarage score every student of group " + group2.getName() + ": ");
		for (int i = 0; i < group2.getStudents().length; i++) {
			System.out.printf(
					group2.getStudents()[i].getSurname() + " " + group2.getStudents()[i].getName() + " - %.2f",
					group2.getStudents()[i].getAvarageStudentScore());
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		System.out.println("Excelent students = " + group2.getAmountExcellentStudent());
		System.out.println("----------------------------------------------");
		System.out.println("Bad students = " + group2.getAmountBadStudent());

	}

}
