package Lista01;

import java.util.Scanner;

public class Exe08 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o valor do número: ");
		numero = leitor.nextInt();
		
		if(numero >= 50){
			System.out.println("Numero maior ou igual a 50");
		}else {
			System.out.println("Numero menor que 50");
		}
	}
	
	
}