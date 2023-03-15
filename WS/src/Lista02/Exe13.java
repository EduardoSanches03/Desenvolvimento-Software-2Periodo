package Lista02;

import java.util.Scanner;

public class Exe13 {

	public static void executar() {
		Scanner leitor = new Scanner(System.in);
		
		
		int n = 0;
		
		System.out.println("Informe a quantidade de elementos: ");
		n = leitor.nextInt();
		
		int[] f = new int[n];
		f[0] = 0;
		f[1] = 1;
		
		for(int i = 2; i < n; i++ ) {
			f[i] = f[i-1] + f[i - 2];
		}
		
		for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }
	}
}