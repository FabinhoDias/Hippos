package business;

import java.util.List;
import dao.ProdutoDAO;
import domain.Produto;

public class ProdutoBusiness {

	ProdutoDAO dao = new ProdutoDAO();

	public boolean salvar(Produto produto) {
		if (dao.buscarProduto(produto.getNome()) != null) {
			return false;
		} else {
			dao.salvarProduto(produto);
			return true;
		}
	}

	public boolean excluir(Produto produto) {
		return dao.removerProduto(produto);

	}

	public List<Produto> getListaDeProdutos() {
		return dao.listaDeProdutos();
	}
	
	public List<Produto> getListaDeProdutosPorCategoria(String categoria) {
		return dao.listaDeProdutosPorCategoria(categoria);
	}

	public Produto getProduto(String nome) {
		return dao.buscarProduto(nome);
	}
	
	public Produto getProduto(int id) {
		return dao.buscarProduto(id);
	}
}