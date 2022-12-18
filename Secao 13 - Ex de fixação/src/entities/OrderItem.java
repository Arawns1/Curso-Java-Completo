package entities;

public class OrderItem {
	Integer quantity;
	Product product;
	

	
	public OrderItem(Integer quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
	public double subTotal() {
		return quantity * product.getPrice();
	}
	
	public String toString() {
		return product.getName() + ",$"+ String.format("%.2f", product.getPrice()) +" Quantity: " + this.getQuantity() + ", Subtotal: $" + String.format("%.2f", this.subTotal()); 
	}
	
}
