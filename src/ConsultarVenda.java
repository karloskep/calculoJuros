import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConsultarVenda {
	
	public static void consultarVenda() throws IOException{
		
		FileReader arquivo = new FileReader("D:\\Calculo Juros.txt");
		
		BufferedReader br = new BufferedReader(arquivo);
		
		while (br.ready()) {
		//lê a proxima linha
		String linha = br.readLine();
		 
		//faz algo com a linha
		System.out.println(linha);
		}
		 
		br.close();
		arquivo.close();
		System.out.println("===========================\n");
		 
		}
		 
	}
	


