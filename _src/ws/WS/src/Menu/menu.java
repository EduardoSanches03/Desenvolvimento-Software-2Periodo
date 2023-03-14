package Menu;

import java.util.Scanner;
import Lista01.*;


public class menu {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		
		String opcao = "";
		String exe = "";
		
		do {
			System.out.println("Qual lista deseja acessar:");
			System.out.println("Lista 01: (l1)");
			System.out.println("Lista 02: (l2)");
			System.out.println("Sair: (s)");
			opcao = leitor.nextLine();

		if(opcao.equals("l1")){
			do {
			System.out.println("Qual exercicio deseja rodar: exe1 ao exe20");
			System.out.println("Voltar para seleção de lista: (v)");
			exe = leitor.nextLine();
			
			switch (exe) {
				case "exe02":
					Lista01.Exe02.executar();
					break;
				case "exe03":
					Exe03.executar();
					break;
				default:
					System.out.println("Opção inválida!");
					
			}
		
			}while(!exe.equals("v"));
			
		}else if(opcao.equals("l2")) {
			do {
			System.out.println("Qual exercicio deseja rodar: exe1 ao exe15");
			System.out.println("Voltar para seleção de lista: (v)");
			exe = leitor.nextLine();
			
			switch (exe) {
			case "exe01":
					Lista02.Exe01.executar();
					break;
			default:
				System.out.println("Opção inválida!");
			}
			
			
			}while(!exe.equals("v"));
		}
			
		}while(!opcao.equals("s"));
		
		leitor.close();
	}
	
}
