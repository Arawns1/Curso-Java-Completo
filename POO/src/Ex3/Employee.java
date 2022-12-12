package Ex3;

import java.util.Scanner;

public class Employee {
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	Double grossSalary, tax;
	
	public Employee() {
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Gross Salary: ");
		grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		tax = sc.nextDouble();
		
	}
	
	public double NetSalary() {
		return grossSalary - tax;
		
	}
	public void IncreseSalary() {
		System.out.print("Which pecentage to increase salary? ");
		double percentage = sc.nextDouble();
		this.grossSalary += (percentage/100) * grossSalary;
		System.out.println("Updated data: \n"+ this.toString());
	}
	
	public String toString() {
		return "Employee: "
				+ this.name
				+ ", $ "
				+ String.format("%.2f", NetSalary());
	}
}
