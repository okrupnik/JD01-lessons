package by.htp.jd01.unit5.hw01;

import java.util.Comparator;

public class TitleComparator implements Comparator<ClericalProduct> {

	@Override
	public int compare(ClericalProduct o1, ClericalProduct o2) {
		int result = o1.getTitle().compareToIgnoreCase(o2.getTitle());
		return result;
	}
	

}
