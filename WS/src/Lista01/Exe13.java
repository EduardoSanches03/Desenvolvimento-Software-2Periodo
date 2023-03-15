package Lista01;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
        double a, b, resultado = 0;
        char operador;

        System.out.print("Digite o valor de A: ");
        a = leitor.nextDouble();

        System.out.print("Digite o valor de B: ");
        b = leitor.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = leitor.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero.");
                } else {
                    resultado = a / b;
                }
                break;
            default:
                System.out.println("Operador não definido.");
                break;
        }

        if (operador != '/' || (operador == '/' && b != 0)) {
            System.out.println("O resultado da operação é: " + resultado);
        }
		
		leitor.close();
	}
	
}