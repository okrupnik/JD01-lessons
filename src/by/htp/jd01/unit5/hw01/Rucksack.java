package by.htp.jd01.unit5.hw01;

import java.util.ArrayList;
import java.util.List;

public class Rucksack {
	private List<ClericalProduct> clericalProducts;
	private Owner owner;

	public Rucksack(List<ClericalProduct> clericalProducts, Owner owner) {
		this.clericalProducts = clericalProducts;
		this.owner = owner;
	}

	public List<ClericalProduct> getClericalProducts() {
		return clericalProducts;
	}

	public void setClericalProducts(List<ClericalProduct> clericalProducts) {
		this.clericalProducts = clericalProducts;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void addWritingAccessory(WritingAccessory writingAccessory) {
		clericalProducts.add(writingAccessory);
	}

	public void addPaper(Paper paper) {
		clericalProducts.add(paper);
	}

	public List<ClericalProduct> searchByTitle(String title) {
		List<ClericalProduct> searchArray = new ArrayList<ClericalProduct>();

		for (ClericalProduct product : clericalProducts) {
			if (product.getTitle().equals(title)) {
				searchArray.add(product);
			}
		}

		return searchArray;
	}

	public List<ClericalProduct> searchByPrice(double startPrice, double endPrice) {
		List<ClericalProduct> searchArray = new ArrayList<ClericalProduct>();

		for (ClericalProduct product : clericalProducts) {
			if ((product.getPrice() >= startPrice) && (product.getPrice() <= endPrice)) {
				searchArray.add(product);
			}
		}

		return searchArray;
	}

	public void print() {
		int count = 1;
		for (ClericalProduct product : clericalProducts) {
			System.out.println(count + " - " + product.toString());
			count++;
		}
	}

	public void print(List<ClericalProduct> clericalProducts) {
		int count = 1;

		if (!clericalProducts.isEmpty()) {
			for (ClericalProduct product : clericalProducts) {
				System.out.println(count + " - " + product.toString());
				count++;
			}
		} else {
			System.out.println("The elements isn't found");
		}
	}
	
	

}
