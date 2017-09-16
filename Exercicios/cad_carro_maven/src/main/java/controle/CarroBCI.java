package controle;

import bean.Carro;

public interface CarroBCI {

	public Boolean verificaKm(Carro c);
	
	public Boolean verificaCinistro(Carro c);
	
	public void insert(Carro c);

	public void delete(Carro c);

	public void update(Carro c);

	public Carro select(Carro c);

}
