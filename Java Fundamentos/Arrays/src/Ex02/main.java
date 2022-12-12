package Ex02;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0;
		double media = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número:");
			vect[i] = sc.nextDouble();
		}
		System.out.println("======================");
		System.out.print("Valores = ");
		for(int i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i] + " "); 
			sum += vect[i];
		}
		System.out.println("\nSoma = "+ sum);
		media = sum / n;
		System.out.println("Média = "+ media);
	}

}
