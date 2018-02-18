package by.htp.jd01.unit5.hw01;

public class WritingAccessory extends ClericalProduct {
	private String typeAccessory;
	private String color;
	
	public WritingAccessory(String title, double price, String typeAccessory, String color) {
		super(title, price);
		this.typeAccessory = typeAccessory;
		this.color = color;
	}

	public String getTypeAccessory() {
		return typeAccessory;
	}

	public void setTypeAccessory(String typeAccessory) {
		this.typeAccessory = typeAccessory;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.getTitle() + ", type " + typeAccessory + ", color - " + color + ", price " + super.getPrice();
	}
	
	
	
}
