import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe o valor do número: ");
		numero = leitor.nextInt();
		
		if(numero >= 50){
			System.out.println("Numero maior ou igual a 50");
		}else {
			System.out.println("Numero menor que 50");
		}
		
		leitor.close();
	}
	
	
}
