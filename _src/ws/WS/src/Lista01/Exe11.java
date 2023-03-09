package Lista01;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero");
		int a = leitor.nextInt();
		
		System.out.println("Informe o segundo numero");
		int b = leitor.nextInt();
		
		System.out.println("Informe o terceiro numero");
		int c = leitor.nextInt();
		
		int menor, meio, maior;
		
		if (a < b && a < c) {
            menor = a;
            if (b < c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b < a && b < c) {
            menor = b;
            if (a < c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a < b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

		
		leitor.close();
	}
	
}