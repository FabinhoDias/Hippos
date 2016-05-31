package application;

import java.awt.List;
import java.util.ArrayList;

import business.ProdutoBusiness;
import business.UsuarioBusiness;
import domain.Endereco;
import domain.Pedido;
import domain.Produto;
import domain.Usuario;

public class TestePolularTabela {
	
	public static void main(String[] args) {
		UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
		ProdutoBusiness produtoBusiness = new ProdutoBusiness();
		
		Endereco endereco = new Endereco("Prof. Eutécia Vital Ribeiro", 490, "Catolé", "Campina Grande", "Paraíba", "Rua do Hemocentro");
		Usuario usuario = new Usuario("José Fábio Dias de Souza", "f", "f", new ArrayList<Pedido>(),endereco);
		
		boolean verifica = usuarioBusiness.salvar(usuario);
		if (verifica) {
			System.out.println("Salvou!");
		} else {
			System.out.println("Não salvou!");
		}
		
		Produto xtudo = new Produto(1, "X-TUDO", 14.99);
		Produto cebolaFrita = new Produto(2, "Cebola Frita", 44.99);
		Produto pizza = new Produto(3, "Pizza", 39.99);
		Produto frozenBombom = new Produto(4, "Frozen Bombom", 4.99);
		Produto frozenPeDeMoleque = new Produto(5, "Frozen Pe de Moleque", 4.99);
		Produto milkshake = new Produto(6, "Milkshake", 7.99);
		
		produtoBusiness.salvar(xtudo);
		produtoBusiness.salvar(cebolaFrita);
		produtoBusiness.salvar(pizza);
		produtoBusiness.salvar(frozenBombom);
		produtoBusiness.salvar(frozenPeDeMoleque);
		produtoBusiness.salvar(milkshake);	
	}
}
