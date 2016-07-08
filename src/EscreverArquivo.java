import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo extends Venda{
	
	public static int linha = 0;

		public static void escreverArquivo() throws IOException{
			
				
			linha ++;
			File arquivo = new File( "D:\\Calculo Juros.txt" );
			boolean existe = arquivo.exists();
			if (existe == false)
			{
				arquivo.createNewFile();
			}			
			
			FileWriter fw = new FileWriter( arquivo,true );
			BufferedWriter bw = new BufferedWriter( fw );
			bw.write(linha+" "+valorTotal+" "+parcelas+" "+valorParcela+" "+valorComJuros);
			bw.newLine();
			bw.close();
			fw.close();
			
			System.out.printf("Arquivo gravado com sucesso!\n");
			System.out.println("===========================\n\n");
			AguardaZero.aguardaZero();
			
	}
		public static void apagarArquivo() throws IOException{
			
		}
}
	