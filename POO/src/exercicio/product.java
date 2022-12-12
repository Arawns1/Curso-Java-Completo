package exercicio;

import java.util.Scanner;

public class product {
	
	Scanner sc = new Scanner(System.in);

	String name;
	int quantity;
	double price; 
	double totalValue;

	

	
	public product() {
		
		System.out.println("Enter product data:");
		
		System.out.print("Name:");
		this.name = sc.nextLine();
		
		System.out.print("Price:");
		this.price = sc.nextDouble();
		
		System.out.print("Quantity in stock:");
		this.quantity = sc.nextInt();
		
		System.out.println(this.toString());
		
	}
	
	public double TotalValueStock() {
		return quantity * price;
		
	}
	
	
	public void AddProducts() {
		System.out.println("\nEnter the number of products to be added in stock:");
		quantity += sc.nextInt();
		System.out.println("Updated data:");
		System.out.println(this.toString());
	}
	

	public void RemoveProducts() {
		System.out.println("\nEnter the number of products to be removed from stock:");
		quantity -= sc.nextInt();
		System.out.println("Updated data:");
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Product Name:"
				+ this.name
				+ " Price: $"
				+ this.price
				+ " "
				+ this.quantity
				+ " units "
				+ "Total value in Stock: "
				+ TotalValueStock();
	}

}
