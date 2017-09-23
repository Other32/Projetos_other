package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // definindo que a classe vai ser gravada no banco
public class Cliente {
	/*
	 * definindo q o atributo id vai ser a chave primária no banco de dados
	 * */
	@Id
	@GeneratedValue// definindo que o valor do id vai ser gerado em sequencia
	private Integer id;
	private String nome;
	private String codigo;
	private Integer pontuacao;
	
	
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	
}
