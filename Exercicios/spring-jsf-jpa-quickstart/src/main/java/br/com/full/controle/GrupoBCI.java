package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Grupo;

public interface GrupoBCI {

	public void insert(Grupo c);
	
	public void update(Grupo c);
	
	public void delete(Grupo c);
	
	public List<Grupo> select();
	
}