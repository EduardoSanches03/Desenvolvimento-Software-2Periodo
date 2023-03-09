package Lista01;

import java.util.Scanner;

public class Exe03 {

		public static void main(String[] args) {
			
			Scanner leitor = new Scanner(System.in);
			
			int a;
			int b;
			
			System.out.println("Digite o valor de A");
			a = leitor.nextInt();
			
			System.out.println("Digite o valor de B");
			b = leitor.nextInt();
			
			if(a == b){
				System.out.println("A sequência de números informada é inválida");
			}else {
				if(a > b) {
					System.out.println("A é maior que B");
				}else {
					System.out.println("A é menor que B");
				}
			}
			
			leitor.close();
			
		}
}