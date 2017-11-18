package br.com.full.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_curso", sequenceName = "curso_seq", initialValue = 1, allocationSize = 1)
public class Curso {

	@Id
	@GeneratedValue(strategy = 
	GenerationType.SEQUENCE, generator = "seq_curso")
	private Integer id;
	private String nome;
	private String chefe;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getChefe() {
		return chefe;
	}
	public void setChefe(String chefe) {
		this.chefe = chefe;
	}

	
}
