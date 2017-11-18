package br.com.full.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Usuario;

public interface UsuarioDaoI extends JpaRepository<Usuario, Long> {}