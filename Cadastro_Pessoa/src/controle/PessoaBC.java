package controle;

import bean.Pessoa;
import dao.PessoaDao;


public class PessoaBC implements PessoaBCI {

	@Override
	public void cadastrar(Pessoa p) {
		PessoaDao pd =new PessoaDao ();
		pd.insert(p);
		
	}

	@Override
	public void excluir(Pessoa p){
		
		
	}
	@Override
	public void atualizar(Pessoa p) {
		
		
	}

	@Override
	public Pessoa select(int id) {
		
		
		return null;
	}
	
	
	
	

}
