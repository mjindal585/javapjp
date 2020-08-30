package bean;

import javax.persistence.*;

@Entity
@Table(name="flower")
public class Objects1 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int FlowerID;
	private String FlowerName;
	private String Color;
	private double Price;
	public Objects1() {}
	public Objects1(String flowerName, String color, double price) {
		super();
		FlowerName = flowerName;
		Color = color;
		Price = price;
	}
	public int getFlowerID() {
		return FlowerID;
	}
	public void setFlowerID(int flowerID) {
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
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Objects1 [FlowerID=" + FlowerID + ", FlowerName=" + FlowerName + ", Color=" + Color + ", Price=" + Price
				+ "]";
	}
	
	

}
