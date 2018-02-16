package by.htp.jd01.unit4.hw03;

import java.util.ArrayList;
import java.util.TreeSet;

public class HomeWork03 {

	public static void main(String[] args) {
		Note note1 = new Note("note1", new Date(13, 2, 2017), true);
		Note note2 = new Note("note2", new Date(28, 10, 2020), false);
		Note note3 = new Note("note3", new Date(5, 12, 2015), true);
		Note note4 = new Note("note4", new Date(11, 6, 2019), true);
		Note note5 = new Note("note5", new Date(24, 8, 2016), false);
		Note note6 = new Note("note6", new Date(17, 1, 2018), true);
		Note note7 = new Note("note7", new Date(15, 4, 2015), false);
		Note note8 = new Note("note5", new Date(24, 8, 2004), true);
		Note note9 = new Note("note3", new Date(17, 1, 2030), true);
		Note note10 = new Note("note1", new Date(15, 4, 2015), false);

		NoteBook noteBook = new NoteBook(new Owner("Ivanov", "Dima", "+375-29-841-95-62"), new ArrayList<>());
		
		noteBook.add(note1);
		noteBook.add(note2);
		noteBook.add(note3);
		noteBook.add(note4);
		noteBook.add(note5);
		noteBook.add(note6);
		noteBook.add(note7);
		noteBook.add(note8);
		noteBook.add(note9);
		noteBook.add(note10);
		
		System.out.println("These are the notes of our notebook:");
		noteBook.print();

		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("These are the sorted notes of our notebook:");
		NoteComparator noteComparator = new NoteComparator();
		noteBook.getNotes().sort(noteComparator);
		noteBook.print();
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("We are searching all notes with text note5");
		noteBook.print(noteBook.searchByText("note5"));
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("We are searching all notes with year - 2015");
		noteBook.print(noteBook.searchByYear(2015));
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("We change note2 to note222, then remove note7 and print our notes:");
		noteBook.changeNote("note2", "note222");
		noteBook.remove("note7");
		noteBook.print();
	}

}
