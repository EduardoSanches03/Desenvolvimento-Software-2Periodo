package Lista01;

import java.util.Scanner;

public class Exe06 {

	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		double celsius;
		
		System.out.println("Informe o valor em graus celsius");
		celsius = leitor.nextDouble();
		
		System.out.println("O valor em Fahrenheint é: " + (9 * celsius + 160) / 5);
		
	}
}
