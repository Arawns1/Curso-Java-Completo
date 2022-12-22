package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+(i+1)+" data:");
			
			System.out.print("Outsourced (y/n)? ");
			String outsource = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();
			
			if(outsource.equals("y") || outsource.equals("Y")) {
				System.out.print("Additional charge: ");
				double addCharge = sc.nextDouble();
				employees.add(new OutsourcedEmployee(name, hours, valueHour, addCharge));
			}
			else{
				employees.add(new Employee(name, hours, valueHour));
			}
			
			
		}
		System.out.println("\nPAYMENTS:");
		for(Employee e: employees) {
			System.out.println(e.getName() + " - $"+String.format("%.2f", e.getPayment()));
		}
	}

}
