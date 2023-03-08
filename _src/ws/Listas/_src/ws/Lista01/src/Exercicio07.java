import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o valor do numero: ");
		numero = leitor.nextInt();
		
		if(numero >= 100 && numero <= 200) {
			
			System.out.println("Esta dentro do intervalo");
			
		}else {
			System.out.println("Não esta dentro do intervalo");
		}
		
		leitor.close();
		
	}
}
