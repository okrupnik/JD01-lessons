package by.htp.jd01.unit4.hw03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class NoteBook {
	private Owner owner;
	private List<Note> notes;

	public NoteBook(Owner owner, List<Note> notes) {
		this.owner = owner;
		this.notes = notes;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	public void add(Note note) {
		notes.add(note);
	}

	public void add(String text, int day, int month, int year) {
		Note newNote = new Note(text, new Date(day, month, year), true);
		notes.add(newNote);
	}
	
	public List<Note> searchByText(String text) {
		List<Note> searchArray = new ArrayList<Note>();
		for(Note note : notes) {
			if(note.getText().equals(text)) {
				searchArray.add(note);
			}
		}
		return searchArray;
	}
	
	public List<Note> searchByYear(int year) {
		List<Note> searchArray = new ArrayList<Note>();
		for(Note note : notes) {
			if(note.getDate().getYear() == year) {
				searchArray.add(note);
			}
		}
		return searchArray;
	}
	
	public void remove(String text) {
		Iterator<Note> iterator = notes.iterator();
		while (iterator.hasNext()) {
			Note note = iterator.next();
			if (note.getText().equals(text)) {
				iterator.remove();
			}
		}
	}
	
	public void changeNote(String currentNote, String newNote) {
		for(Note note : notes) {
			if(note.getText().equals(currentNote)) {
				note.setText(newNote);
			}
		}
	}
	
	public void print() {
		int count = 1;
		for(Note note : notes) {
			System.out.println(count + " - " + note.toString());
			count++;
		}
	}
	
	public void print(List<Note> list) {
		int count = 1;
		for(Note note : list) {
			System.out.println(count + " - " + note.toString());
			count++;
		}
	}
	
	
}
