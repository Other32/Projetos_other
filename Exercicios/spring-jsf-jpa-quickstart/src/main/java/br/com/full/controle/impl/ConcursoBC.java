package br.com.full.controle.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Concurso;
import br.com.full.controle.ConcursoBCI;
import br.com.full.dao.ConcursoDaoI;

@Controller
public class ConcursoBC implements ConcursoBCI{
	
	@Autowired
	ConcursoDaoI dao;
	
	public void insert(Concurso c){
		dao.save(c);
	}
	
	public void update(Concurso c){
		dao.save(c);
	}
	
	public void delete(Concurso c){
		dao.delete(c);
	}
	
	public List<Concurso> select(){
		return dao.findAll();
	}
}