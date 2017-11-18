package br.com.full.controle.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Carro;
import br.com.full.controle.CarroBCI;
import br.com.full.dao.CarroDaoI;

@Controller
public class CarroBC implements CarroBCI {

	@Autowired
	private CarroDaoI dao;

	@Override
	public void cadastrar() {
		System.out.println("teste cadastro");
		Carro c = new Carro();
		c.setCor("Azul");

		dao.save(c);
		
	}

}
