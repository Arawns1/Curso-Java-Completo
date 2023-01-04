package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Installment {
	private Date dueDate; // Vencimento
	private double amount;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment(Date dueDate, double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return sdf.format(this.getDueDate()) + " - R$" + String.format("%.2f", this.getAmount());
	}
}
