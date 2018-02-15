package by.htp.jd01.unit4.hw03;

import java.util.TreeSet;

public class HomeWork03 {

	public static void main(String[] args) {
		Note note1 = new Note("note1", new Date(13, 2, 2017), true);
		Note note2 = new Note("note2", new Date(28, 10, 2020), false);
		Note note3 = new Note("note3", new Date(5, 12, 2015), true);

		// note1.compareTo(note2);

		/*
		 * TreeSet<Note> set = new TreeSet<Note>();
		 * 
		 * set.add(note1); set.add(note2); set.add(note3); for (Note n: set){
		 * System.out.println(n.getDate().getYear()); }
		 */

		//NoteComparator comparator = new NoteComparator();
		/*TreeSet<Note> set2 = new TreeSet<Note>(comparator);

		set2.add(note1);
		set2.add(note2);
		set2.add(note3);

		for (Note n : set2) {
			System.out.println(n.getDate().getYear());
		}*/

	}

}
