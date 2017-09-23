package controle;

import java.util.List;

import bean.Cliente;

public interface ClienteBCI {
	
	public Boolean checkPontos(Cliente c); 
	
	public void insert(Cliente c);
	
	public List<Cliente> select();

}
