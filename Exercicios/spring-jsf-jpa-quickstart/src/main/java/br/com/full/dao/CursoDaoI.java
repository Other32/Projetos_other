package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Curso;

public interface CursoDaoI extends JpaRepository<Curso, Long> {}
