import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] nota = new double[5];
		int[] peso = new int[5];
		int i,denominador = 0;
		double numerador = 0, media = 0;
		

		for(i = 0; i < nota.length; i++) {
			System.out.println("Informe a "+(i+1)+"° nota");
			nota[i] = leitor.nextDouble();
			
		}
		
		for(i = 0; i < nota.length; i++) {
			System.out.println("Informe, respectivamente, o peso das notas: ");
			peso[i] = leitor.nextInt();
			
			denominador += peso[i];
			
			numerador += nota[i] * peso[i];
		}
		
		media = numerador / denominador;
		
		System.out.println(""+media+" - media geral do aluno");
		
		leitor.close();
	}
}
