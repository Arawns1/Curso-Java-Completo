package entities;

public abstract class Contribuintes {
	private String cpf;
	private String name;
	private double anualIncome;
	private static double totalTaxes;
	
	public Contribuintes(String cpf, String name, double anualIncome) {
		super();
		this.cpf = cpf;
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public Contribuintes () {
		
	}
	
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	
	
	
}
