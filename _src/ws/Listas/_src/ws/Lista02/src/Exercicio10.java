import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			a[i] = leitor.nextInt();
		}
		
		System.out.println("Vetor b:");
		
		for(int i = 0; i  < 5; i++) {
			b[i] = a[4-i];
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(b[i]+"");
		}
		
		leitor.close();
	}
}
