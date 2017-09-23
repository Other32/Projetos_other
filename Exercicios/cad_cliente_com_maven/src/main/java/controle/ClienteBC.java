package controle;

import java.util.List;

import bean.Cliente;
import dao.ClienteDao;
import dao.ClienteDaoI;

public class ClienteBC implements ClienteBCI {
	private ClienteDaoI cd = new ClienteDao();

	public void insert(Cliente c) {
		if(this.checkPontos(c)) {
			cd.insert(c);
			System.out.println("inserido com sucesso");
		}else {
			System.out.println("pontuação insuficiente");
		}
	}

	public Boolean checkPontos(Cliente c) {
		return c.getPontuacao() > 10;
	}

	public List<Cliente> select() {
		List<Cliente> list = cd.select(); 
		
		return list;
	}

}






