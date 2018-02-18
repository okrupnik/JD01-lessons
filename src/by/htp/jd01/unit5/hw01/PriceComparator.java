package by.htp.jd01.unit5.hw01;

import java.util.Comparator;

public class PriceComparator implements Comparator<ClericalProduct> {

	@Override
	public int compare(ClericalProduct o1, ClericalProduct o2) {
		if (o1.getPrice() > o2.getPrice()) {
			return 1;
		}
		
		if (o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		
		return 0;
	}
	
}
