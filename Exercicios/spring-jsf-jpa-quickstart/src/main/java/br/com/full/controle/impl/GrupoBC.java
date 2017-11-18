package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Grupo;
import br.com.full.controle.GrupoBCI;
import br.com.full.dao.GrupoDaoI;

@Controller
public class GrupoBC implements GrupoBCI {

	@Autowired
	private GrupoDaoI dao;
	
	public void insert(Grupo c){
		dao.save(c);
	}
	
	public void update(Grupo c){
		dao.save(c);
	}
	
	public void delete(Grupo c){
		dao.delete(c);
	}
	
	public List<Grupo> select(){
		return dao.findAll();
	}

}
