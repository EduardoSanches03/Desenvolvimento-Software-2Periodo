package principal.Controller;

import java.util.List;
import java.util.Scanner;
import principal.daos.*;
import principal.model.*;

public class PacienteController {

	private static DAO<Paciente> dao = new PacienteDAO();
	
	public static void listar() {
	List<Paciente> pacientes = dao.listar();
	
	for(Paciente paciente : pacientes) {
		System.out.println("Id:" + paciente.getId());
		System.out.println("Código: " + paciente.getCodigo());
		System.out.println("Nome:" + paciente.getNome());
	}
}
	
	
	public static void cadastrar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o Codigo do paciente");
		String codigo = leitor.nextLine();
		
		System.out.println("Informe o Nome do Paciente: ");
		String nome = leitor.nextLine();
		
		Paciente paciente = new Paciente(codigo, nome);
		
		dao.salvar(paciente);
		
		leitor.close();	
		
	}
	
	public static void atualizar(){ 
		Scanner leitor = new Scanner(System.in);
		int id = 0;
		
		System.out.println("Digite o Id do Paciente: ");
		id = leitor.nextInt();
		leitor.nextLine();
		Paciente pacienteAtualizado = dao.buscarPorId(id);
		
		System.out.println("Informe o Codigo do paciente");
		String codigo = leitor.nextLine();
		
		System.out.println("Informe o Nome do Paciente: ");
		String nome = leitor.nextLine();
		
		pacienteAtualizado.setCodigo(codigo);
		pacienteAtualizado.setNome(nome);

		dao.atualizar(pacienteAtualizado);
		
		leitor.close();
	}
	
	public static void excluir() {
		Scanner leitor = new Scanner(System.in);
		int id = 0;
		
		
		System.out.println("Digite o Id do Paciente:");
		id = leitor.nextInt();
		
		dao.excluir(id);
		
		leitor.close();
	}
	
}
