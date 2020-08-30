package bean;

public class Pro2 {
	public Pro2() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String FlowerID;
	private String FlowerName;
	private String Color;
	private float Price;
	public Pro2(String flowerID, String flowerName, String color, float price) {
		super();
		FlowerID = flowerID;
		FlowerName = flowerName;
		Color = color;
		Price = price;
	}
	public String getFlowerID() {
		return FlowerID;
	}
	public void setFlowerID(String flowerID) {
		FlowerID = flowerID;
	}
	public String getFlowerName() {
		return FlowerName;
	}
	public void setFlowerName(String flowerName) {
		FlowerName = flowerName;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Pro2 [FlowerID=" + FlowerID + ", FlowerName=" + FlowerName + ", Color=" + Color + ", Price=" + Price
				+ "]";
	}
	
	
}
