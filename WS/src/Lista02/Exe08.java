package Lista02;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemnto do vetor a");
			a[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemnto do vetor b");
			b[i] = leitor.nextInt();
		}
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int i = 0; i < b.length; i++) {
			c[i + 5] = b[i];
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println(""+c[i]);
		}
		leitor.close();
	}
}