package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_and_Filewriter {

	public static void main(String[] args) {
		String[] lines = new String[] {"Olá mundo!", "Bom dia!", "Boa tarde!"};
		
		String path = "C:\\Users\\Gabriel\\Documents\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			System.out.println("Arquivo gravado com sucesso!");
		} catch (IOException e ) {
			System.out.println("Error: " + e.getMessage());
		}


	}

}
