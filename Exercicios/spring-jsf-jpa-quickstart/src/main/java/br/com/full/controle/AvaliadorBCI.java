package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Avaliador;

public interface AvaliadorBCI {

	public void insert(Avaliador c);
	
	public void update(Avaliador c);
	
	public void delete(Avaliador c);
	
	public List<Avaliador> select();
	
}