package by.htp.jd01.unit4.hw03;

import java.util.Comparator;

public class NoteComparator implements Comparator<Note> {

	@Override
	public int compare(Note obj1, Note obj2) {
		String textObj1 = obj1.getText();
		String textObj2 = obj2.getText();

		int yearObj1 = obj1.getDate().getYear();
		int yearObj2 = obj2.getDate().getYear();

		int result = textObj1.compareToIgnoreCase(textObj2);
		if (result != 0) {
			return result;
		}

		if (yearObj1 > yearObj2) {
			return 1;
		}

		if (yearObj1 < yearObj2) {
			return -1;
		}

		return 0;
	}

}
