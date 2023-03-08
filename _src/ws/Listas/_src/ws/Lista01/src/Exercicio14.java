import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro termo da PA: ");
        double a1 = sc.nextDouble();

        System.out.print("Informe a razão da PA: ");
        double r = sc.nextDouble();

        System.out.print("Informe o valor de n: ");
        int n = sc.nextInt();

        double an = a1 + (n - 1) * r;

        System.out.println("O " + n + "º termo da PA é: " + an);

        sc.close();
    }
}