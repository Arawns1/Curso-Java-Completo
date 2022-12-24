package entities;

public class Individual extends Contribuintes {
	
	private double healthSpendings;

	public Individual(String cpf, String name, double anualIncome, double healthSpendings) {
		super(cpf, name, anualIncome);
		this.healthSpendings = healthSpendings;
		Contribuintes.setTotalTaxes(getTotalTaxes() + this.totalPaid()); 
	}

	public Individual() {
		super();
	}

	public double getHealthSpendings() {
		return healthSpendings;
	}

	public void setHealthSpendings(double healthSpendings) {
		this.healthSpendings = healthSpendings;
	}
	
	public double totalPaid() {
		double taxes = 0;
		
		if(this.getAnualIncome() < 20000) {
			taxes += this.getAnualIncome() * 0.15;
		}
		else {
			taxes += this.getAnualIncome() * 0.25;
		}
		
		if(this.getHealthSpendings() != 0) {
			taxes -= this.getHealthSpendings() * 0.5;	
		}
		
		return taxes;
		
	}
	
	
}
