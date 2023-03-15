package Lista02;

import java.util.Scanner;

public class Exe09 {

	public static void executar() {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento do vetor a");
			a[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			b[i] = leitor.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
	            if (i % 2 == 0) { 
	                c[i] = a[i];
	            } else { 
	                c[i] = b[i];
	            }
	        }
		
	     System.out.println("O vetor C é:");
	     for (int i = 0; i < 5; i++) {
	         System.out.print(c[i] + " ");
	        }
	}
	
}
