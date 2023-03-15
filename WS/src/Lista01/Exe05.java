package Lista01;

import java.util.Scanner;

public class Exe05 {
	
	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int aux;
		
		System.out.println("Informe o valor do primeiro numero");
		numero1 = leitor.nextInt();
		
		System.out.println("Inform e o valor do segundo numero");
		numero2 = leitor.nextInt();
		
		System.out.println("" + numero1 +"\n"+ numero2);
		
		aux = numero1;
		numero1 = numero2;
		numero2 = aux;
		
		System.out.println("" + numero1 + "\n" + numero2);
		
	}
}