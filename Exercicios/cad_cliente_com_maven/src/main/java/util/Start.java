package util;

import java.util.List;

import bean.Cliente;
import controle.ClienteBC;
import controle.ClienteBCI;

public class Start {
	public static void main(String[] args) {
		
		ClienteBCI cbi = new ClienteBC();
		
		List<Cliente> l = cbi.select();
		
		for (Cliente cliente : l) {
			System.out.println(cliente.getNome());
		}
		
	}
}
