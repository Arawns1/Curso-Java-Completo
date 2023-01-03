package ExFixação.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<String> strProdutos = new ArrayList<>();
		List<Produto> produtos = new ArrayList<>();
		
		System.out.println("Enter a csv file path:  ");
		String strPath = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){

			String line = br.readLine();
			
			while (line != null) {
				//fORMATANDO E ADICIONADO A 1º LISTA
				String formatedLine = line.replaceAll("\"", "");
				strProdutos.add(formatedLine);
				line = br.readLine();
			}
			
			for(String item : strProdutos) {  // PEGA CADA LINHA DO ARQUIVO
				
				String[] fields = item.split(","); // SEPARA ATÉ CADA VIRGULA E COLOCA NUMA LISTA
				String name = fields[0]; // APENAS OS NOMES;
				double price = Double.parseDouble(fields[1].replaceAll(" ", ""));
				int quantity = Integer.parseInt(fields[2].replaceAll(" ", ""));
				produtos.add(new Produto(name, price, quantity));
			}
			
			System.out.println("*** PRODUTOS: ***");
			for(Produto p : produtos) {
				System.out.println(p);
			}
			
			
			//Gerando novo arquivo
			
			gerarCSV(produtos, strPath);
			
			
		} catch (IOException e) {
			System.out.println("Error: " +  e.getMessage());
		}
	}
	
	public static void gerarCSV(List<Produto> produtos, String path) {
		
			
		
		File arquivo = new File(path);
		
		String newPath = arquivo.getParent() + "\\subdir";
	
		
		boolean sucess = new File(newPath).mkdir();	
				
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPath + "\\out.csv"))){
			
			
			for(Produto p : produtos) {
				bw.write(p.getName() + "," + p.getTotal());
				bw.newLine();
			}
			System.out.println("Arquivo gravado com sucesso!");
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
