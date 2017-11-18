package br.com.full.controle.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.full.bean.Professor;
import br.com.full.controle.ProfessorBCI;
import br.com.full.dao.ProfessorDaoI;

@Controller
public class ProfessorBC implements ProfessorBCI {
	@Autowired
	ProfessorDaoI dao;
	
	public void insert(Professor c){
		dao.save(c);
	}
	
	public void update(Professor c){
		dao.save(c);
	}
	
	public void delete(Professor c){
		dao.delete(c);
	}
	
	public List<Professor> select(){
		return dao.findAll();
	}

}
