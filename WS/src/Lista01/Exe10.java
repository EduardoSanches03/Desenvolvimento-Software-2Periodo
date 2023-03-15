package Lista01;

import java.util.Scanner;

public class Exe10 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o valor do numero no intervalo entre 1 a 5: ");
		numero = leitor.nextInt();
		
		 if(numero < 1 || numero > 5) {
			 System.out.println("Valor inválido");
		 }else {
			 if(numero == 1) {
				 System.out.println("um");
			 }
			 if(numero == 2) {
				 System.out.println("dois");
			 }
			 if(numero == 3) {
				 System.out.println("tres");
			 }
			 if(numero == 4) {
				 System.out.println("quatro");
			 }
			 if(numero == 5) {
				 System.out.println("cinco");
			 }
		 }
	}
}
