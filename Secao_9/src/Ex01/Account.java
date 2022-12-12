package Ex01;

import java.util.Scanner;

public class Account {
	
	Scanner sc = new Scanner(System.in);
	
	private int numAcc;
	private String name;
	private double balance;
	
	
	public Account() {
		
		System.out.print("Enter account Holder: ");
		this.name = sc.nextLine();
		
		System.out.print("Enter account number: ");
		this.numAcc = sc.nextInt();

		System.out.print("Is there any initial deposit? (y/n): ");
		
		char ans = sc.next().charAt(0);
		if( ans == 'y' || ans == 'Y' ) {
			System.out.print("Enter initial deposit value: ");
			this.balance = sc.nextDouble();
		}
		else{
			this.balance = 0;
		}
		
		System.out.println(this.toString());
		
	}
	
	
	public void deposit() {
		System.out.print("Enter a deposit value:");
		balance += sc.nextDouble();
		System.out.println(this.toString());
	}
	
	public void withdraw() {
		System.out.print("Enter a withdraw value:");
		balance -= (sc.nextDouble() + 5.00);
		System.out.println(this.toString());
		
	}


	public int getNumAcc() {
		return numAcc;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public double getBalance() {
		return balance;
	}





	public String toString() {
		return "\nAccount data \n"
			+ "Account: "
			+ this.getNumAcc()
			+ ", Holder: "
			+ this.getName()
			+ ", Balance: $"
			+ String.format("%.2f", this.getBalance())
			+ "\n";
	}
	
	
	
	
	
	
}






