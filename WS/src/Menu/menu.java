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
			System.out.println("Qual exercicio deseja rodar: exe01 ao exe14");
			System.out.println("Voltar para seleção de lista: (v)");
            exe = leitor.nextLine();	
			
			switch (exe) {
				case "exe02":
					Lista01.Exe02.executar();
					break;
				case "exe03":
					Lista01.Exe03.executar();
					break;
				case "exe04":
					Lista01.Exe04.executar();
					break;
				case "exe05":
					Lista01.Exe05.executar();
					break;
				case "exe06":
					Lista01.Exe06.executar();
					break;
				case "exe07":
					Lista01.Exe07.executar();
					break;
				case "exe08":
					Lista01.Exe08.executar();
					break;
				case "exe09":
					Lista01.Exe09.executar();
					break;
				case "exe10":
					Lista01.Exe10.executar();
					break;
				case "exe11":
					Lista01.Exe11.executar();
					break;
				case "exe12":
					Lista01.Exe12.executar();
					break;
				case "exe13":
					Lista01.Exe13.executar();
					break;
				case "exe14":
					Lista01.Exe14.executar();
					break;
				default:
					System.out.println("Opção inválida!");
					
			}
		
			}while(!exe.equals("v"));
		
		}else if(opcao.equals("l2")) {
			do {
			System.out.println("Qual exercicio deseja rodar: exe01 ao exe13");
			System.out.println("Voltar para seleção de lista: (v)");
			exe = leitor.nextLine();
			
			switch (exe) {
			case "exe01":
					Lista02.Exe01.executar();
					break;
			case "exe02":
				Lista02.Exe02.executar();
				break;
			case "exe03":
				Lista02.Exe03.executar();
				break;
			case "exe04":
				Lista02.Exe04.executar();
				break;
			case "exe05":
				Lista02.Exe05.executar();
				break;
			case "exe06":
				Lista02.Exe06.executar();
				break;
			case "exe07":
				Lista02.Exe07.executar();
				break;
			case "exe08":
				Lista02.Exe08.executar();
				break;
			case "exe09":
				Lista02.Exe09.executar();
				break;
			case "exe10":
				Lista02.Exe10.executar();
				break;
			case "exe11":
				Lista02.Exe11.executar();
				break;
			case "exe12":
				Lista02.Exe12.executar();
				break;
			case "exe13":
				Lista02.Exe13.executar();
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
