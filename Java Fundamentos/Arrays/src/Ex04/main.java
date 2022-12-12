package Ex04;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int j = 1;
		System.out.println("Quantas pessoas você vai digitar?");
		n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+ j +"ª pessoa");
			sc.nextLine();
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			j++;
		}
		
		
		
		int init = age[0];
		int position = 0;
		
		for(int i = 0; i < n; i++) {
			if(age[i] > init) {
				init = age[i];
				position = i;
			}
		}
		
		System.out.println("Pessoa mais velha:"+  name[position]);
	}

}
