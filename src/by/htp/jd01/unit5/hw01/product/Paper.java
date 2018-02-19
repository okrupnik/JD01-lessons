package by.htp.jd01.unit5.hw01.product;

public class Paper extends ClericalProduct {
	private String format;
	private String color;
		
	public Paper(String title, double price, String format, String color) {
		super(title, price);
		this.format = format;
		this.color = color;
	}
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.getTitle() + ", format " + format + ", color - " + color + ", price " + super.getPrice();
	}

}
