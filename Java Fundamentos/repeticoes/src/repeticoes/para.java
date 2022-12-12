
package repeticoes;

import java.util.Scanner;

public class para {

	// N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		int produto = 1;
		
		for(int i = 1; i <= n; i++) {
		
			produto = produto * i;
			
		}
		
		System.out.println(produto);
	

}

}