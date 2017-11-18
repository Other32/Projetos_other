package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Avaliador;
import br.com.full.controle.AvaliadorBCI;
import br.com.full.dao.AvaliadorDaoI;

@Controller
public class AvaliadorBC implements AvaliadorBCI {

	@Autowired
	AvaliadorDaoI dao;
	
	public void insert(Avaliador c){
		dao.save(c);
	}
	
	public void update(Avaliador c){
		dao.save(c);
	}
	
	public void delete(Avaliador c){
		dao.delete(c);
	}
	
	public List<Avaliador> select(){
		return dao.findAll();
	}

}
