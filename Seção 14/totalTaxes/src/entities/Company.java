package entities;

public class Company extends Contribuintes {

	private int employeeNumber;

	public Company(String cpf, String name, double anualIncome, int employeeNumber) {
		super(cpf, name, anualIncome);
		this.employeeNumber = employeeNumber;
		Contribuintes.setTotalTaxes(getTotalTaxes() + this.totalPaid()); 
	}


	public Company() {
		super();
	}
	
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}


	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}


	public double totalPaid() {
		
		if(this.getEmployeeNumber() > 10) {
			return this.getAnualIncome() * 0.14;
		}
		else {
			return this.getAnualIncome() * 0.16;
		}
	}
}
