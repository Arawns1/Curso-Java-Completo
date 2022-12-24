package entities;

public abstract class Contribuintes {
	private String name;
	private double anualIncome;
	private static double totalTaxes;
	
	public Contribuintes(String name, double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public Contribuintes () {
		
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAnualIncome() {
		return anualIncome;
	}
	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}
	public static double getTotalTaxes() {
		return totalTaxes;
	}
	public static void setTotalTaxes(double totalTaxes) {
		Contribuintes.totalTaxes = totalTaxes;
	}
	
	public abstract double totalPaid();
	
	public String toString() {
		return this.getName() + " : $ " + String.format("%.2f", this.totalPaid());
	}
}
