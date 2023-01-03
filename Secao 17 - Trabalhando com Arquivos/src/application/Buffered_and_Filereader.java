package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffered_and_Filereader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\Gabriel\\Documents\\in.txt";
		
		FileReader fs = null;
		BufferedReader br = null;
		
		try {
			fs = new FileReader(path);
			br = new BufferedReader(fs);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		finally {
			try {
				if(br != null) {
					br.close();
				};
				if(fs != null) {
					fs.close();
				};
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		};
		
	}

}
