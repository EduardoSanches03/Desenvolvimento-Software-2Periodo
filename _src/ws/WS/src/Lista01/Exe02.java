package Lista01;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero1;
		int numero2;
		
		
		System.out.println("Digite o primeiro numero");
		numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero");
		numero2 = leitor.nextInt();
		
		int total = numero1 + numero2;
		
		System.out.println("O total da soma é: "+ total);
		
		leitor.close();
	}

}	