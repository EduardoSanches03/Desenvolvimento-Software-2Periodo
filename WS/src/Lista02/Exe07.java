package Lista02;

import java.util.Scanner;

public class Exe07 {

	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[5];
		int[] vetor2 = new int[5];
		int i;
		
		for(i = 0; i < vetor.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento do primeiro vetor");
			vetor[i] = leitor.nextInt();
		}
		
		for(i = 0; i < vetor2.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento do segundo vetor");
			vetor2[i] = leitor.nextInt();
			}
			
		boolean iguais = true;
        for ( i = 0; i < vetor.length; i++) {
            if (vetor[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }

        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
	}
}
