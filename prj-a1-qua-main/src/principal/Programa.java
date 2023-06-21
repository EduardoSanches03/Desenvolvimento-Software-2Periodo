package principal;

import java.lang.ModuleLayer.Controller;
import java.util.Scanner;
import principal.Controller.*;

public class Programa {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao1;
		int opcao2 = 0;
		
		System.out.println("Selecione a opcao: 1 - paciente / 2 - medicamento");
		opcao1 = leitor.nextInt();
		
		if(opcao1 == 1) {
		
			System.out.println("Selecione a opcao: ");
			opcao2 = leitor.nextInt();
			
			switch(opcao2) {
			case 1:
				principal.Controller.PacienteController.listar();
			break;
			case 2:
				principal.Controller.PacienteController.cadastrar();
			break;
			case 3:
				principal.Controller.PacienteController.atualizar();
			break;
			case 4:
				principal.Controller.PacienteController.excluir();
			break;
			}
	}
		if(opcao1 == 2) {
			
			System.out.println("Selecione a opcao: ");
			opcao2 = leitor.nextInt();
			
			switch(opcao2) {
			case 1:
				principal.Controller.MedicamentoController.listar();
			break;
			case 2:
				principal.Controller.MedicamentoController.cadastrar();
			break;
			case 3:
				principal.Controller.MedicamentoController.atualizar();
			break;
			case 4:
				principal.Controller.MedicamentoController.excluir();
			break;
			}
		}
		
		
		
		leitor.close();
	}
}
