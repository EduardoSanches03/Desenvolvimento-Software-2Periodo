import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º elemento: ");
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }

        int media = soma / vetor.length;
        System.out.println("A média dos valores é: " + media);

        System.out.println("Valores iguais ou superiores à média: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] >= media) {
                System.out.println(vetor[i]);
            }
        }
    }
}