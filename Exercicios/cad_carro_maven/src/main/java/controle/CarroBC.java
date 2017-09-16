package controle;

import bean.Carro;
import dao.CarroDao;
import dao.CarroDaoI;

public class CarroBC implements CarroBCI {
	
	public CarroDaoI cd = new CarroDao();

	
	@Override
	public void insert(Carro c) {
		if(this.verificaKm(c) && this.verificaCinistro(c)) {
			cd.insert(c);
		}else {
			/*
			 * não faz nada
			 * */
		}
	
	}
	
	
	@Override
	public Boolean verificaKm(Carro c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean verificaCinistro(Carro c) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Carro c) {
		
		cd.delete(c);
		
	}

	@Override
	public void update(Carro c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carro select(Carro c) {
		// TODO Auto-generated method stub
		return null;
	}}
