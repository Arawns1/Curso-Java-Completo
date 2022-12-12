import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner (System.in);
		System.out.printf("Informe o nome do arquivo:");
		String caminhoArquivo = scanner.nextLine();
		InputStream is = null;
		OutputStream os = null;		
		try {
			is = new FileInputStream(caminhoArquivo);
			os = new FileOutputStream("cópia de" + caminhoArquivo);
			byte[] buffer = new byte[1024];
			while((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
		}
		catch{
			System.out.printf("ERRO NA ABERTURA DO ARQUIVO: %S.\n",e.getMessage());
		}
		finally {
			is.close();
			os.close();}

	}

}
