package Ex5;

public class CurrencyConverter {


	public static void conversor(double cotacao, double qntd) {
		
		double total = cotacao * qntd;
		double totalWithTax = total + (total * 0.06);
		
		System.out.printf("Amount to be paid in reais: R$%.2f ", totalWithTax);
	}
}
