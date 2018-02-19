package by.htp.jd01.unit5.hw01;

import java.util.ArrayList;

import by.htp.jd01.unit5.hw01.comparator.PriceComparator;
import by.htp.jd01.unit5.hw01.comparator.TitleAndPriceComparator;
import by.htp.jd01.unit5.hw01.comparator.TitleComparator;
import by.htp.jd01.unit5.hw01.product.Paper;
import by.htp.jd01.unit5.hw01.product.WritingAccessory;
import by.htp.jd01.unit5.hw01.rule.Owner;
import by.htp.jd01.unit5.hw01.rule.Rucksack;

public class HomeWork01 {

	public static void main(String[] args) {
		WritingAccessory pen1 = new WritingAccessory("Pen1", 20.75, "feather", "blue");
		WritingAccessory pen2 = new WritingAccessory("Pen2", 5.25, "ball-point", "red");
		WritingAccessory pencil1 = new WritingAccessory("Pencil1", 8.25, "mechanical", "grey");
		WritingAccessory pencil2 = new WritingAccessory("Pencil1", 5.25, "mechanical", "red");
		
		Paper fotoPaper1 = new Paper("Lomond", 17.99, "A4", "white");
		Paper fotoPaper2 = new Paper("HP", 7.35, "A5", "white");
		Paper officePaper1 = new Paper("Navigator", 7.00, "A4", "multicolor");
		Paper officePaper2 = new Paper("Xerox", 9.00, "A3", "white");
		
		Rucksack beginnerRucksack = new Rucksack(new ArrayList<>(), new Owner("Ivanov", "Petya"));
		beginnerRucksack.addWritingAccessory(pen1);
		beginnerRucksack.addPaper(fotoPaper1);
		beginnerRucksack.addWritingAccessory(pen2);
		beginnerRucksack.addPaper(fotoPaper2);
		beginnerRucksack.addWritingAccessory(pencil1);
		beginnerRucksack.addPaper(officePaper1);
		beginnerRucksack.addWritingAccessory(pencil2);
		beginnerRucksack.addPaper(officePaper2);
		
		beginnerRucksack.print();
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("These are the sorted product by title:");
		TitleComparator titleComparator = new TitleComparator();
		beginnerRucksack.getClericalProducts().sort(titleComparator);
		beginnerRucksack.print();
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("These are the sorted product by price:");
		PriceComparator priceComparator = new PriceComparator();
		beginnerRucksack.getClericalProducts().sort(priceComparator);
		beginnerRucksack.print();
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("These are the sorted product by title and by price:");
		TitleAndPriceComparator titleAndPriceComparator = new TitleAndPriceComparator();
		beginnerRucksack.getClericalProducts().sort(titleAndPriceComparator);
		beginnerRucksack.print();
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("We are searching all notes with title - Pencil1:");
		beginnerRucksack.print(beginnerRucksack.searchByTitle("Pencil1"));
		
		System.out.println("____________________________________");
		System.out.println("************************************");
		
		System.out.println("We are searching all notes with price more 7.00 and less 27");
		beginnerRucksack.print(beginnerRucksack.searchByPrice(7, 27));
	}

}
