import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Venda {
	
	//declaração de variáveis
	public static double valorTotal;
	public static int parcelas;
	private double juros;
	public static double valorComJuros;
	public static double valorParcela;

	
	//instancias		
	Scanner sc = new Scanner(System.in);
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public double getJuros() {
		return juros;
	}
	public void setJuros(double juros) {
		this.juros = juros;
	}
	public double getValorComJuros() {
		return valorComJuros;
	}
	public void setValorComJuros(double valorComJuros) {
		this.valorComJuros = valorComJuros;
	}
	public double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public int getParcelas() {
		return parcelas;
	}
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
	public void vender() throws IOException{
		
		ArrayList<Double> lista = new ArrayList<Double>();
		lista.add(0,0.0);
		lista.add(1,0.0);
		lista.add(2,0.05);
		lista.add(3,0.1);
		lista.add(4,0.15);
		lista.add(5,0.2);
		lista.add(6,0.25);
		lista.add(7,0.3);
		lista.add(8,0.35);
		lista.add(9,0.4);
		lista.add(10,0.45);
		
		System.out.println("===========================");
		System.out.println("|1 - Cadastrar uma venda|");
		System.out.println("===========================\n");
		System.out.println("Digite o valor da compra:");
		
		valorTotal = sc.nextDouble();
		LimparConsole.limpaTela();
		
		System.out.println("===========================");
		System.out.println("|1 - Cadastrar uma venda|");
		System.out.println("===========================\n");
		System.out.println("Digite o número de parcelas:");
		
		parcelas = sc.nextInt();
		LimparConsole.limpaTela();
	
		if(parcelas<=10){
			
			if(parcelas!=0){
				
				if (parcelas==1){
					
					System.out.println("Pagamento á vista. Venda sem juros!");
					
				}
				else{
					juros = valorTotal*(lista.get(parcelas));
					valorComJuros = valorTotal+juros;
					valorParcela = (valorComJuros/parcelas);

					System.out.println("===========================");
					System.out.println("Valor com juros: R$"+(valorComJuros));
					System.out.println("===========================");
					System.out.println("Valor da parcela: R$"+(valorComJuros/parcelas));
					System.out.println("===========================");
					EscreverArquivo.escreverArquivo();			
				}		
			
			}
			else{
				
				System.out.println("Reavalie o parcelamento.");
			}
		}		
		else{
			
			System.out.printf("Limite de parcelas excedido!");
			
	
		}
	
	}
}
