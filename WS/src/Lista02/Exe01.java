package Lista02;

import java.util.Scanner;

public class Exe01 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da sequencia");
		int tamanho = leitor.nextInt();
		
		for (int i = 1; i <= tamanho; i++) {
            System.out.print("Digite o " + i + "º número da sequência: ");
            int numero = leitor.nextInt();
            
            if(numero > 0) {
            	System.out.println(""+" Numero Positiovo");
            }
            else if(numero < 0) {
            	System.out.println(""+" Numero Negativo");
            }else {
            	System.out.println(""+" Zero");
            }
		}
		leitor.close();
	}
}