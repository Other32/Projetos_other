package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Concurso;

public interface ConcursoDaoI extends JpaRepository<Concurso, Long>  {}
