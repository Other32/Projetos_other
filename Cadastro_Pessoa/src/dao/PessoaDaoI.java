package dao;

import bean.Pessoa;

public interface PessoaDaoI {
	
	public void insert(Pessoa p);
	
	public void delete(Pessoa p);
	
	public void update(Pessoa p);
	
	public Pessoa select(int id);
	

}
