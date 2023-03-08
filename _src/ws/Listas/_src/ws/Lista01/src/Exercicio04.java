import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Informe o valor do primeiro numero");
		numero1 = leitor.nextInt();
		
		System.out.println("Informe o valor do segundo numnero");
		numero2 = leitor.nextInt();
		
		
		System.out.println("A soma dos valor é: "+ (numero1 + numero2));
		System.out.println("A soma dos valor é: "+ (numero1 - numero2));
		System.out.println("A soma dos valor é: "+ (numero1 * numero2));
		System.out.println("A soma dos valor é: "+ (numero1 / numero2));
		
		leitor.close();
	}
}
