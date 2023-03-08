import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] a = new int[12];
		int produto = 1;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			a[i] = leitor.nextInt();
		
				if(a[i] % 2 == 0 ) {
					if(a[i] > 0) {
						produto *= a[i];
					}
				}
		}
		
		System.out.println(""+produto);
		
		
		leitor.close();
	}
}
