package Lista02;

import java.util.Scanner;

public class Exe03 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[5];
		int [] vetor2 = new int[5];
		int i;
		
		for(i=0;i < vetor.length;i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			vetor[i] = leitor.nextInt();
		}
		
		for(i=0;i < vetor.length;i++) {
			System.out.println(""+vetor[i]*2);
		}
	}
}