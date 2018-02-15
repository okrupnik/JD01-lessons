package by.htp.jd01.unit4.hw03;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public class Notebook {

	private ArrayList<Note> arrayNotes = null;

	public Notebook() {

		this.arrayNotes = new ArrayList<>();
	}

	public void addNote(int id, String surname, String name, String address, String phoneNumber) {
		Note note = new Note(id, surname, name, address, phoneNumber);
		arrayNotes.add(note);
	}

	public boolean searchNote(Note searchNote) {

		for (Note note : arrayNotes) {
			if (note.equals(searchNote)) {
				return true;
			}
		}

		return false;
	}

	public void printNote() {
		for (Note note : arrayNotes) {
			System.out.println(note.toString());
		}
	}

}
