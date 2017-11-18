package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Empresa;
import br.com.full.controle.EmpresaBCI;
import br.com.full.dao.EmpresaDaoI;

@Controller
public class EmpresaBC implements EmpresaBCI {

	@Autowired
	private EmpresaDaoI dao;
	
	public void insert(Empresa c){
		dao.save(c);
	}
	
	public void update(Empresa c){
		dao.save(c);
	}
	
	public void delete(Empresa c){
		dao.delete(c);
	}
	
	public List<Empresa> select(){
		return dao.findAll();
	}

}
