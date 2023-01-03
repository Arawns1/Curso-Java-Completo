package ExFixação.application;

public class Produto {
	String name;
	double price;
	int quantity;
	
	
	public Produto(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getTotal() {
		return this.getPrice() * this.getQuantity();
	}
	
	public String toString() {
		return "Product name: " +this.getName() + ", $" + String.format("%.2f", this.getPrice()) + ", Quantity: " + this.getQuantity();
	}
}
