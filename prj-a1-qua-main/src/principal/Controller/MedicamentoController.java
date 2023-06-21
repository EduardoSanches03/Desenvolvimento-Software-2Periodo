package principal.Controller;

import java.util.List;
import java.util.Scanner;
import principal.daos.*;
import principal.model.*;

public class MedicamentoController {

	private static DAO<Medicamento> dao = new MedicamentoDAO();
	
	public static void listar() {
		List<Medicamento> medicamentos = dao.listar();
		
		for(Medicamento medicamento : medicamentos) {
			System.out.println("Id: "+ medicamento.getId());
			System.out.println("Nome: "+ medicamento.getNome());
		}
	}
	public static void cadastrar() {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = leitor.nextLine();
		
		Medicamento medicamento = new Medicamento(nome);
		dao.salvar(medicamento);
		
		leitor.close();
	}
	
	public static void atualizar() {
		
		Scanner leitor = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Digite o Id do medicamento: ");
		id = leitor.nextInt();
		leitor.nextLine();
		Medicamento medicamentoAtualizado = dao.buscarPorId(id);
		
		System.out.println("Informe o Nome: ");
		String nome = leitor.nextLine();
		
		medicamentoAtualizado.setNome(nome);
		
		dao.atualizar(medicamentoAtualizado);
		
		leitor.close();
	}
	
	public static void excluir() {
		
		Scanner leitor = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Digite o Id do medicamento: ");
		id = leitor.nextInt();
		
		dao.excluir(id);
		
		leitor.close();
	}
	
}
