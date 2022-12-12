package Ex03;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n;
		int j = 1;
		double sumHeigth = 0;
		double lessThen16 = 0;
		
		System.out.print("Quantas pessoas serão digitadas:");
		n = sc.nextInt();
		
		Person[] Pvect = new Person[n];
		
		for(int i = 0; i < Pvect.length; i++) {
			System.out.println("Dados da "+ j +"ª pessoa");
			sc.nextLine();
			System.out.print("Nome:");
			String name = sc.nextLine();
			System.out.print("Idade:");
			int age = sc.nextInt();
			System.out.print("Altura:");
			double height = sc.nextDouble();
			Pvect[i] = new Person(name, age, height);
			j++;
			
		}
		
		for(int i = 0; i < Pvect.length; i++) {
			sumHeigth += Pvect[i].height;
			if(Pvect[i].age < 16) {
				lessThen16++;
			}
		}
		
		double media = sumHeigth / n;
		double percent16 = (lessThen16 / n) * 100;
		
		System.out.println("Altura média: "+ Math.round(media));
		
		System.out.println("Pessoas com menos de 16 anos: "+ percent16+"%");
		
		for(int i = 0; i < Pvect.length; i++) {
			if(Pvect[i].age < 16) {
				System.out.println(Pvect[i].name);
			}
		}
		
	}

}
