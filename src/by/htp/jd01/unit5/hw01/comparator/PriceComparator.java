package by.htp.jd01.unit5.hw01.comparator;

import java.util.Comparator;

import by.htp.jd01.unit5.hw01.product.ClericalProduct;

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
