package dao;

import bean.Carro;

public interface CarroDaoI {
	
	public void insert(Carro c);
	
	public void delete(Carro c);
	
	public void update(Carro c);
	
	public Carro select(Carro c);
	
	
}
