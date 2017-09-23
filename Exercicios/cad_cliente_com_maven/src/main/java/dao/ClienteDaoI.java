package dao;

import java.util.List;

import bean.Cliente;

public interface ClienteDaoI {

	public void insert(Cliente c);
	
	public List<Cliente> select();
	
}
