package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithoutBalanceException;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int num = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double init_balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdraw_limit = sc.nextDouble();
			
			Account c1 = new Account(num, holder, init_balance, withdraw_limit);
			
			System.out.println("");
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			c1.withdraw(amount);
			System.out.print("New Balance: " + String.format("%.2f", c1.getBalance()) );	
		}
		catch(WithoutBalanceException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
