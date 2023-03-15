package Lista01;

import java.util.Scanner;

public class Exe07 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o valor do numero: ");
		numero = leitor.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			
			System.out.println("Esta dentro do intervalo");
			
		}else {
			System.out.println("Não esta dentro do intervalo");
		}
	}
}