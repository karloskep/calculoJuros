import java.util.Scanner;

public class AguardaZero {
	
	public static void aguardaZero(){
		
		Scanner sc = new Scanner(System.in);
		
		int sair=1;
		
		do{
			System.out.println("Digite 0 para continuar");
			sair = sc.nextInt();
		}
		while(sair!=0);
		
	}
	
}
