package Ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("How many employees will be registered?");
		n = sc.nextInt();
		
		List<Employees> employeeList = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+ (i+1));
			System.out.print("Id:");
			Integer id = sc.nextInt();
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary:");
			Double salary = sc.nextDouble();
			Employees emp = new Employees(id, name, salary);
			employeeList.add(emp);
			
		}
		
		

		System.out.print("Enter the employee id that will have salary incrase:");
		int index = sc.nextInt();
		Integer pos = position(employeeList, index);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter de percentage: ");
			double percent = sc.nextDouble();
			employeeList.get(pos).increaseSalary(percent);;
		}
		
		
		
		System.out.println("\nList of employees: ");
		for(Employees emp : employeeList) {
			System.out.println(emp);
		}
		
		sc.close();
	}	

	public static Integer position(List<Employees> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
