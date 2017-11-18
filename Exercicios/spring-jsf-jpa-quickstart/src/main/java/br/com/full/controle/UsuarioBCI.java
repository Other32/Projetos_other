package br.com.full.controle;

import java.util.List;

import br.com.full.bean.Usuario;

public interface UsuarioBCI {

	public void insert(Usuario c);
	
	public void update(Usuario c);
	
	public void delete(Usuario c);
	
	public List<Usuario> select();
	
}