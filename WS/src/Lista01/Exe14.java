package Lista01;

import java.util.Scanner;

public class Exe14 {
	
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o primeiro termo da PA: ");
        double a1 = leitor.nextDouble();

        System.out.print("Informe a razão da PA: ");
        double r = leitor.nextDouble();

        System.out.print("Informe o valor de n: ");
        int n = leitor.nextInt();

        double an = a1 + (n - 1) * r;

        System.out.println("O " + n + "º termo da PA é: " + an);

    }
}