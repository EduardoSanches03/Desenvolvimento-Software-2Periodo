package Lista02;

import java.util.Scanner;

public class Exe11 {

	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento do primeiro vetor");
			a[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento do segundo vetor");
			b[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			result += a[i] * b[i];
		}
		
		System.out.println("Resultado do produto escalar: "+result);
		
		leitor.close();
	}
}