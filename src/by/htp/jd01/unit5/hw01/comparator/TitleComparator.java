package by.htp.jd01.unit5.hw01.comparator;

import java.util.Comparator;

import by.htp.jd01.unit5.hw01.product.ClericalProduct;

public class TitleComparator implements Comparator<ClericalProduct> {

	@Override
	public int compare(ClericalProduct o1, ClericalProduct o2) {
		int result = o1.getTitle().compareToIgnoreCase(o2.getTitle());
		return result;
	}
	

}
