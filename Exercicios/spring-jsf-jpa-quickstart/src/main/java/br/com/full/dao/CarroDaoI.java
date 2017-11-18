package br.com.full.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.full.bean.Carro;

public interface CarroDaoI extends JpaRepository<Carro, Long> {
}