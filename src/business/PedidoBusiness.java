package business;

import java.util.List;
import dao.PedidoDAO;
import domain.Pedido;
import domain.Usuario;

public class PedidoBusiness {

	PedidoDAO dao = new PedidoDAO();

	public boolean salvar(Pedido pedido) {
		return dao.salvarPedido(pedido);
	}

	public boolean excluir(Pedido pedido) {
		return dao.removerPedido(pedido);
	}
	
	public boolean atualizar(Pedido pedido) {
		return dao.atualizarPedido(pedido);
	}
	
	public List<Pedido> getListaDePedidosDoUsuario(String nome) {
		return dao.listaDePedidosDoUsuario(nome);
	}

	public List<Pedido> getListaDePedidos() {
		return dao.listaDePedidos();
	}

	public Pedido getPedido(Usuario usuario) {
		return dao.buscarPedido(usuario);
	}

	public Pedido getPedido(int id) {
		return dao.buscarPedido(id);
	}
}
