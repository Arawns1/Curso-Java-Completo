package Ex05;

import java.util.Locale;
import java.util.Scanner;
import Ex05.Studente;

public class main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		Studente[] quartos = new Studente[10];
		
		System.out.print("How many rooms will be rented?");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nRent #"+(i+1)+":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			quartos[room] = new Studente(name, email);
		}
		
		System.out.println("\nBusy Rooms:");
		for (int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + ": " + quartos[i]);
			}
		}
	}

}
