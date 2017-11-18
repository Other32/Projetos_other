package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Concurso;

public interface ConcursoBCI {

	public void insert(Concurso c);
	
	public void update(Concurso c);
	
	public void delete(Concurso c);
	
	public List<Concurso> select();
	
}
