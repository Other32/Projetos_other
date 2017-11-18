package br.com.full.controle.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Curso;
import br.com.full.controle.CursoBCI;
import br.com.full.dao.CursoDaoI;

@Controller
public class CursoBC implements CursoBCI{
	
	@Autowired
	private CursoDaoI dao;
	
	public void insert(Curso c){
		dao.save(c);
	}
	
	public void update(Curso c){
		dao.save(c);
	}
	
	public void delete(Curso c){
		dao.delete(c);
	}
	
	public List<Curso> select(){
		return dao.findAll();
	}
}
