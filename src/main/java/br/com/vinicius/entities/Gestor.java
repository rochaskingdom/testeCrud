package br.com.vinicius.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Gestor {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String matricula;
	private String nascimento;
	private String setor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gestor(String nome, String matricula, String nascimento, String setor) {
		this.nome = nome;
		this.matricula = matricula;
		this.nascimento = nascimento;
		this.setor = setor;
	}

	public Gestor() {

	}

	@Override
	public String toString() {
		return "Gestor [id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", nascimento=" + nascimento
				+ ", setor=" + setor + "]";
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
