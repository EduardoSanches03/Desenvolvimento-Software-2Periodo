package Lista01;

import java.util.Scanner;

public class Exe09 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Informe o valor de a: ");
		a = leitor.nextInt();
		
		System.out.println("Informe o valor de b: ");
		b = leitor.nextInt();
		
		if(a == b) {
			System.out.println("Valores iguais");
		}else {
			if(a > b){
				System.out.println("Valores diferentes, o maior valor é: " + a);
			}
		}if(b > a) {
			System.out.println("Valores diferentes, o maior valor é: " + b);
		}
		
		leitor.close();
		
	}

}