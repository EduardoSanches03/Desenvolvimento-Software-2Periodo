import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		System.out.println("Informe um número");
		numero = leitor.nextInt();
		
		if(numero > 10) {
			System.out.println("Número maior do que 10");
		}else {
			System.out.println("Número menor ou igual a 10");
		}
		
		leitor.close();
	}

}