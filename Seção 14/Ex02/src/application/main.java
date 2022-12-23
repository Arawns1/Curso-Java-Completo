package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> productsList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #"+(i+1)+" data:");
			System.out.print("Common, used or imported (c/u/i) ?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			switch(type){
				case 'i':
					System.out.print("Customs fee:");
					double fee = sc.nextDouble();
					productsList.add(new ImportedProduct(name, price, fee));
				break;
					
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					String stringDate = sc.next();
					Date formatedDate = sdf.parse(stringDate);
					productsList.add(new UsedProduct(name, price, formatedDate));
				break;
					
				default:
					productsList.add(new Product(name, price));
				break;
			}
			
			
			
		}
		System.out.println("\nPRICE TAGS:");
		for(Product p: productsList) {
			System.out.println(p.priceTag());
		}

	}

}
