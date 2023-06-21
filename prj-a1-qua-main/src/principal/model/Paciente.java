package principal.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String codigo;
	private String nome;
	
	@OneToMany(mappedBy = "paciente")
	private List<Medicamento> medicamentos;
	
	public Paciente() {
		
	}
	
	public Paciente(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
