package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class main {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		
		// Cliente
		System.out.println("Enter Client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY: ");
		Date data = sdf1.parse(sc.next());
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		Client c1 = new Client(name, email, data);
		
		// Fim cliente
		
		System.out.println("Enter order status: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine());
		System.out.print("How many items to this order? ");
		
		int n = sc.nextInt();
		
		List<OrderItem> temp = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Enter #" + (1 + i) + " item data:");
			
			System.out.print("Product name: ");
			String p_name = sc.nextLine();
			
			System.out.print("Product price: ");
			Double p_price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer p_quantity = sc.nextInt();

			temp.add(new OrderItem(p_quantity, new Product(p_name, p_price)));
			
		}
		
		Order o1 = new Order(data, status, c1, temp);
	}

}
