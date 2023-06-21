package principal.model;

import jakarta.persistence.*;

@Entity
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="paciente_codigo", referencedColumnName="codigo") 
	private Paciente paciente;
	
	public Medicamento() {
		
	}


	public Medicamento(String nome) {
		super();
		this.nome = nome;
	}

	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
