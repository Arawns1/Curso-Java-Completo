package repeticoes;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Opções disponíveis:");
		System.out.println("1 - alcool");
		System.out.println("2 - gasolina");
		System.out.println("3 - diesel");
		System.out.println("4 - fim");
		
		
		System.out.println("Escolha uma opção:");
		int opt = sc.nextInt();
		int alcool = 0; 
		int gasolina = 0;
		int diesel = 0;
		
	
		while(opt != 4) {
			switch(opt) {
			case 1:
				System.out.println("1 - Alcool");
				alcool++;
				break;
			case 2:
				System.out.println("2 - Gasolina");
				gasolina++;
				break;
			case 3:
				System.out.println("3 - Diesel");
				diesel++;
				break;
			case 4:
				System.out.println("4 - Fim");
				break;
			default:
				System.out.println("Muito Obrigado");
				break;
			}
			System.out.println("Escolha uma opção:");
		 opt = sc.nextInt();
		}
			
		System.out.printf("Alcool: %d \ngasolina: %d \ndiesel: %d", alcool, gasolina, diesel);
		
		
		}

}
