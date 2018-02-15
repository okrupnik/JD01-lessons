package by.htp.jd01.unit4.hw03;

import java.util.ArrayList;
import java.util.TreeSet;

public class NoteBook {
	private Owner owner;
	private TreeSet<Note> notes;

	public NoteBook(Owner owner) {
		this.owner = owner;
		notes = new TreeSet<Note>();
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public TreeSet<Note> getNotes() {
		return notes;
	}

	public void setNotes(TreeSet<Note> notes) {
		this.notes = notes;
	}

	public void add(String text, int day, int month, int year) {
		Note newNote = new Note(text, new Date(day, month, year), true);
		notes.add(newNote);
	}
}
