package by.htp.jd01.unit4.hw03;

public class HomeWork03 {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		
		notebook.addNote(1, "Ivanov", "Dima", "Kotlovca street, 25-3", "+375-29-236-84-95");
		notebook.addNote(2, "Sidorov", "Petya", "Bakinskaya street, 8-123", "+375-29-669-12-13");
		notebook.addNote(3, "Petrov", "Vasya", "Luninca street, 5-36", "+375-25-321-65-47");
		notebook.addNote(4, "Ivanov", "Kolya", "Lenina street, 65-13", "+375-29-654-62-51");
		notebook.addNote(5, "Novikova", "Sveta", "Masherova street, 18-78", "+375-29-614-78-41");
		notebook.addNote(6, "Turkina", "Nina", "Druzhby street, 2-115", "+375-33-321-98-45");
		
		Note note7 = new Note(3, "Petrov", "Vasya", "Luninca street, 5-36", "+375-25-321-65-47");
				
		if (notebook.searchNote(note7)) {
			System.out.println("Search note: " + note7.toString());
		} else {
			System.out.println("This note doesn't exist!");
		}
		
		System.out.println("________________________________________________________________");
		System.out.println();
		System.out.println("****************************************************************");
		System.out.println("________________________________________________________________");
		
		System.out.println("All notes of your notebook:");
		notebook.printNote();

	}

}
