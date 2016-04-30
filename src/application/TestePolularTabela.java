package application;

import business.UsuarioBusiness;
import domain.Endereco;
import domain.Usuario;

public class TestePolularTabela {
	
	public static void main(String[] args) {
		UsuarioBusiness business = new UsuarioBusiness();
		
		Endereco endereco = new Endereco("Prof. Eut�cia Vital Ribeiro", 490, "Catol�", "Campina Grande", "Para�ba", "Rua do Hemocentro");
		Usuario usuario = new Usuario("Jos� F�bio Dias de Souza", "a", "a", endereco);
		
		boolean verifica = business.salvar(usuario);
		if (verifica) {
			System.out.println("Salvou!");
		} else {
			System.out.println("N�o salvou!");
		}
	}
}
