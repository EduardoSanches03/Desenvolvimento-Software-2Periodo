package principal;


import java.util.List;

import jakarta.persistence.*;
import principal.modelos.Pessoa;

public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;
	
	public static void main(String[] args) {
		
		emf = Persistence.createEntityManagerFactory("exe_mysql");
		em = emf.createEntityManager();
		
		Pessoa p = new Pessoa("Joao", "4121562332");
//		salvar(p);
		
		
		Pessoa p2 = buscarPorId(3);
		System.out.println();
		System.out.println("--------------");
		
		System.out.println("id:" + p2.getId() +" Nome:"+p2.getNome()+" Cpf:"+p2.getCpf());
		
		System.out.println("--------------");
		System.out.println();
		
		
		p2.setNome("Eduardo");
		atualizar(p2);
		
		
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("--------------");
		System.out.println();
		
		apagar(1);
		System.out.println("removido");
		
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Lista de Pessoas: ");
		List<Pessoa> lista = Listar();
		for(Pessoa pessoa : lista) {
			System.out.println("id:" + pessoa.getId() +" Nome:"+pessoa.getNome()+" Cpf:"+pessoa.getCpf());
		}
		System.out.println("--------------");
		System.out.println();
		
		
		em.close();
		emf.close();
		
	}
	
	public static Integer apagar(Integer id) {
		Pessoa p = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		return p.getId();
	}
	
	
	public static Integer atualizar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.merge(pessoa);
		em.getTransaction().commit();
		return pessoa.getId();
	}
	
	public static Pessoa buscarPorId(Integer id) {
		Pessoa pessoa = em.find(Pessoa.class, id);
		return pessoa;
	}
	
	public static List<Pessoa> Listar(){
		List<Pessoa> Lista = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		return Lista;
	}
	
	public static Integer salvar(Pessoa pessoa) {
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		return pessoa.getId();
	}
	
}
