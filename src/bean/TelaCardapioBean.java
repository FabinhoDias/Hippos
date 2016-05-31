package bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import business.HistoricoBusiness;
import business.PedidoBusiness;
import business.ProdutoBusiness;
import business.UsuarioBusiness;
import domain.Historico;
import domain.Pedido;
import domain.Produto;
import domain.Usuario;
import service.Sessao;

public class TelaCardapioBean {

	private UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
	private HistoricoBusiness historicoBusiness = new HistoricoBusiness();
	private ProdutoBusiness produtoBusiness = new ProdutoBusiness();
	private PedidoBusiness pedidoBusiness = new PedidoBusiness();
	private Pedido pedido = new Pedido();
	private List<Produto> produtos = new ArrayList<Produto>();
	private TelaPrincipalBean telaPrincipalBean = new TelaPrincipalBean();

	public TelaCardapioBean() {
		produtos = new ArrayList<Produto>();
	}

	public void addXTUDO() {
		Produto xtudo = produtoBusiness.getProduto(1);
		produtos.add(xtudo);
	}

	public void addCebolaFrita() {
		Produto cebolaFrita = produtoBusiness.getProduto(2);
		produtos.add(cebolaFrita);
	}

	public void addPizza() {
		Produto pizza = produtoBusiness.getProduto(3);
		produtos.add(pizza);
	}

	public void addFrozenBombom() {
		Produto frozenBombom = produtoBusiness.getProduto(4);
		produtos.add(frozenBombom);
	}

	public void addFrozenPeDeMoleque() {
		Produto frozenPeDeMoleque = produtoBusiness.getProduto(5);
		produtos.add(frozenPeDeMoleque);
	}

	public void addMilkshake() {
		Produto milkshake = produtoBusiness.getProduto(6);
		produtos.add(milkshake);
	}

	public void concluirPedido() throws IOException {
		if (produtos.isEmpty()) {
			System.out.println("Não tem produto no carrinho");
		} else {
			Usuario usuario = Sessao.getUsuario();
			pedido = new Pedido();
			pedido.setStatus("em andamento");
			pedido.setNomeUsuario(usuario.getNome());
			pedido.setData(new Date());
			pedido.setProdutos(produtos);			
			usuario.getPedidos().add(pedido);
			usuarioBusiness.atualizar(usuario);

			/*if (usuarioBusiness.validar(Sessao.getUsuario().getLogin(), Sessao.getUsuario().getSenha())) {
				Historico historico = historicoBusiness.getHistorico(Sessao.getUsuario());
				List<Pedido> pedidos;
				if (historico == null) {
					historico = new Historico();
					pedidos = new ArrayList<Pedido>();
					pedidos.add(pedido);
					historico.setPedidos(pedidos);
					historico.setUsuario(Sessao.getUsuario());
					historicoBusiness.salvar(historico);
				} else {
					pedidos = historico.getPedidos();
					pedidos.add(pedido);
					historico.setPedidos(pedidos);
					historicoBusiness.atualizar(historico);
				}
			} else {
				List<Pedido> pedidos = new ArrayList<Pedido>();
				pedidos.add(pedido);
				Historico historico = new Historico();
				historico.setUsuario(Sessao.getUsuario());
				historico.setPedidos(pedidos);
				historicoBusiness.salvar(historico);
			}*/
			
			produtos.clear();
			pedido = new Pedido();
		}
	}

	public void removerProduto(Produto indice) {
		produtos.remove(indice);
	}

	public void limparLista() {
		produtos.clear();
		System.out.println("Limpei!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
