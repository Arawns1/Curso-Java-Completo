package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//inicio get departamento
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		//fim departamento
		
		//inicio worker data
		
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Level: ");
		String level = sc.nextLine(); 
		System.out.print("Base salary: ");
		double salary = sc.nextDouble();
		
		Worker w1 = new Worker(name, WorkerLevel.valueOf(level), salary, new Department(departmentName));
		
		//fim worker data
		
		
		//Adicionando contratos
		System.out.print("How many contracts to this worker?: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Enter contract #"+(i+1)+" data:");
			System.out.print("Date(DD/MM/YYYY):" );
			Date data = sdf.parse(sc.next());
			System.out.print("Value per hour:" );
			double valueperhour = sc.nextDouble();
			System.out.print("Duration(hours):" );
			int duration = sc.nextInt();
			
			HourContract contract = new HourContract(data, valueperhour, duration);
			w1.addContract(contract);
		}
		//dfim contratos
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + w1.getName());
		System.out.println("Department: " + w1.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": "+ String.format("%.2f", w1.income(year, month)));
		
	}

}

