package by.htp.jd01.unit3.hw04;

import java.sql.Date;

public class HomeWork04 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Ivanov", "Petya", "Nikolaevich", new Date(1990 - 1900, 5, 1),
				"Minsk, Kolasa street, 25/13", "+375-29-555-66-77", "construction", 3);
		Student student2 = new Student(2, "Sidorov", "Ivan", "Petrovich", new Date(1981 - 1900, 9, 15),
				"Gomel, Bogdanovicha street, 93/125", "+375-29-623-11-22", "programming", 2);
		student1.show();
		System.out.println("-----------------------------------------------");
		student2.show();
		System.out.println("-----------------------------------------------");
		student1.change("+375-25-956-88-77", 5);
		student1.show();
		System.out.println("-----------------------------------------------");
		student2.change("+375-33-754-32-17", 3);
		student2.show();

		Customer customer1 = new Customer(1, "Petrov", "Dmitriy", "Ivanovich", "Minsk, Bakinskaya street, 65/113",
				"1234-5678-4321-9876", 6594);
		Customer customer2 = new Customer(2, "Vasechkin", "Aleksandr", "Dmitrevich", "Minsk, Lenina street, 5/11",
				"9876-4321-1234-6789", 6595);
		customer1.show();
		System.out.println("-----------------------------------------------");
		customer2.show();
		System.out.println("-----------------------------------------------");
		customer1.change("gde-to", "1111-1111-1111-1111");
		customer1.show();
		System.out.println("-----------------------------------------------");
		customer2.change("outside", "1313-1313-1313-1313");
		customer2.show();
	}

}


