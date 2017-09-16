package controle;

import bean.Pessoa;

public interface PessoaBCI {
	
	public void cadastrar(Pessoa p);
	
	public void excluir(Pessoa p);
	
	public void atualizar(Pessoa p);
	
	public Pessoa select(int id);

	
}
