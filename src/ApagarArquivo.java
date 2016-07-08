import java.io.File;

public class ApagarArquivo {
	
	public static void apagarArquivo(){
		
		LimparConsole.limpaTela();
		System.out.println("===========================");
		System.out.println("TEM CERTEZA QUE DESEJA APAGAR AS VENDAS?");	
		System.out.println("O PROCESSO NÃO PODE SER REVERTIDO!");	
		System.out.println("===========================\n");
		
		File arquivo = new File( "D:\\Calculo Juros.txt" );
		arquivo.delete();
	}
}
