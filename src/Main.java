import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//instancia
		Scanner sc = new Scanner(System.in);
		
		//variaveis
		
			
		int opcao = 0;
		
		boolean continuar=true;
		
		
		do {
			LimparConsole.limpaTela();
			System.out.println("===========================");
			System.out.println("Digite a opção desejada:");
			System.out.println("===========================");
			System.out.println("1 - Cadastrar uma venda\n");
			System.out.println("2 - Consultar uma venda\n");
			System.out.println("3 - Apagar vendas\n");
			System.out.println("4 - Sair\n");
			
			opcao = sc.nextInt();
			
			if(opcao >= 1 & opcao < 4){
				
				if(opcao == 1){
				
				LimparConsole.limpaTela();
				Venda venda = new Venda();
				venda.vender();
				
				}
				
			if(opcao ==2){
					
				LimparConsole.limpaTela();
				System.out.println("===========================");
				System.out.println("Consultar uma venda");
				System.out.println("===========================\n");
				ConsultarVenda.consultarVenda();
				AguardaZero.aguardaZero();
				LimparConsole.limpaTela();
					
			}
				
			if(opcao == 3){
					
				LimparConsole.limpaTela();
				System.out.println("===========================");
				System.out.println("Apagar vendas");	
				System.out.println("===========================\n");
				ApagarArquivo.apagarArquivo();
				AguardaZero.aguardaZero();
				LimparConsole.limpaTela();
			}
				
						
		}
				
				
			else{
				LimparConsole.limpaTela();
				continuar = false;
				
			}
		}
		
		while (continuar);
		sc.close();		
	}

}
	