package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	public static final SimpleDateFormat smt = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;
	

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + this.getPrice() + " (Manufacture date" + smt.format(manufactureDate) + ")";
	}

}
