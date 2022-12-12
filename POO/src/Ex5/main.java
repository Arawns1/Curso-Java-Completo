package Ex5;

import java.util.Scanner;
import Ex5.CurrencyConverter;


public class main {
	
	public static void main(String[] args) {
		CurrencyConverter.conversor(inpDollar(), inputQntd());
	}
	
	
	
	public static double inpDollar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price?");
		return sc.nextDouble();
	}
	
	public static double inputQntd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many dolars will be bought?");
		return sc.nextDouble();
	}
}
