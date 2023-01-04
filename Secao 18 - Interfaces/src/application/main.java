package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		
		try {
			System.out.print("Numero do contrato: ");
			int number = Integer.parseInt(sc.nextLine());
			
			System.out.print("Data (dd/MM/yy) : ");
			String date = sc.nextLine();
			Date formatedDate = sdf.parse(date);
			
			System.out.print("Valor do Contrato: ");
			double amount = Double.parseDouble(sc.nextLine());
			
			System.out.print("Entre o número de parcelas: ");
			int months = Integer.parseInt(sc.nextLine());
			
			Contract c1 = new Contract(number, formatedDate, amount);
			
			ContractService service = new ContractService();
			
			service.processContract(c1, months);
			
			c1.getInstallment();
		} 
		catch(NumberFormatException e) {
			System.out.println("Digite um número válido Erro: " + e.getMessage());
		}
		
		catch(ParseException e) {
			System.out.println("Data inválida " + e.getMessage());
		}
		
		
	}

}
