import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int [] vetor = new int[5];
		int n,i;
		
		System.out.println("Informe um número qualquer: ");
		n = leitor.nextInt();
		
		for(i = 0; i < vetor.length; i++) {
			System.out.println("Informe o "+(i+1)+"° elemento");
			vetor[i] = leitor.nextInt();
		}
		
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] < n) {
				System.out.println(""+vetor[i]);
			}
		}
		
		leitor.close();
	}
}