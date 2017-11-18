package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Empresa;

public interface EmpresaDaoI extends JpaRepository<Empresa, Long> {}