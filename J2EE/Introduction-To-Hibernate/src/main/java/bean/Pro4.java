package bean;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Pro4 {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int ProductId;
	
	private String ProductName;
	
	private double Price;

	public Pro4() {}
	public Pro4(String productName, double price) {
		super();
		ProductName = productName;
		Price = price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int id) {
		this.ProductId = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Pro4 [id=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + "]";
	}
	

}
