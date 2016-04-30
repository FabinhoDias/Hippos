package application;

import business.UsuarioBusiness;
import domain.Endereco;
import domain.Usuario;

public class TestePolularTabela {
	
	public static void main(String[] args) {
		UsuarioBusiness business = new UsuarioBusiness();
		
		Endereco endereco = new Endereco("Prof. Eutécia Vital Ribeiro", 490, "Catolé", "Campina Grande", "Paraíba", "Rua do Hemocentro");
		Usuario usuario = new Usuario("José Fábio Dias de Souza", "a", "a", endereco);
		
		boolean verifica = business.salvar(usuario);
		if (verifica) {
			System.out.println("Salvou!");
		} else {
			System.out.println("Não salvou!");
		}
	}
}
