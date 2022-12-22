package entities;

public class ImportedProduct extends Product {
	private double customsFee;
	
	

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	

	public ImportedProduct() {	
	}



	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return super.getPrice() + this.getCustomsFee();
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " $ " + this.getPrice() + "(Custom Fees = $"+ this.getCustomsFee()+")";
	}
	
}
