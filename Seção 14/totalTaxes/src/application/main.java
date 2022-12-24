package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contribuintes;
import entities.Individual;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> taxPayers = new ArrayList<>();
		
		System.out.println("======= Calculadore de IR =======");
		
		System.out.print("Enter the number of taxes payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company? (i/c) ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpendings = sc.nextDouble();
				taxPayers.add(new Individual(name, anualIncome, healthSpendings));
			}
			else {
				System.out.print("Number of employees: ");
				int employeeNumver = sc.nextInt();
				taxPayers.add(new Company(name, anualIncome, employeeNumver));
			}
			
			
			
		}
		System.out.println("TAXES PAID: ");
		for(Contribuintes e : taxPayers) {
			System.out.println(e.toString());
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f",Contribuintes.getTotalTaxes()));
	}

}
