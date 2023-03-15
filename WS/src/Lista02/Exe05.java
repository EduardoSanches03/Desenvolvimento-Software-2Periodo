package Lista02;

import java.util.Scanner;

public class Exe05 {

	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[5];
		int n,i,q = 0;
		
		System.out.println("Informe um número qualquer: ");
		n = leitor.nextInt();
		
		for(i = 0; i < vetor.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			vetor[i] = leitor.nextInt();
			if(n == vetor[i]) {
				q++;
			}
		}
		
		
		System.out.println(""+q+" vezes o número se repetiu no vetor");

	}
}
