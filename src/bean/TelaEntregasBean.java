package bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import business.HistoricoBusiness;
import business.PedidoBusiness;
import business.UsuarioBusiness;
import domain.Pedido;
import service.Sessao;

@ManagedBean
@SessionScoped
public class TelaEntregasBean {
	
	private UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
	private Pedido pedido = new Pedido();
	private PedidoBusiness pedidoBusiness = new PedidoBusiness();
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	private List<Pedido> historico = new ArrayList<Pedido>();
	
	public TelaEntregasBean() {
		setPedidos(Sessao.getUsuario().getPedidos());
		//historico = pedidoBusiness.getListaDePedidosDoUsuario(Sessao.getUsuario().getId());
	}
	
	public void navBarEntregas() throws IOException {
		pedidos = pedidoBusiness.getListaDePedidos();
		FacesContext.getCurrentInstance().getExternalContext().redirect("entregas.xhtml");
	}
	
	public void abaPerfil() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("perfilPrincipal.xhtml");
	}
	
	public void abaHistorico() throws IOException {
		historico = pedidoBusiness.getListaDePedidosDoUsuario(Sessao.getUsuario().getNome());
		FacesContext.getCurrentInstance().getExternalContext().redirect("perfilHistorico.xhtml");
	}
	
	
	
	public void excluirConta() throws IOException {
		usuarioBusiness.excluir(Sessao.getUsuario());
		FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
	}
	
	public void pegarHistorico() {
		//setHistorico(pedidoBusiness.getListaDePedidosDoUsuario(Sessao.getUsuario().getId()));
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Pedido> getHistorico() {
		return historico;
	}

	public void setHistorico(List<Pedido> historico) {
		this.historico = historico;
	}
	
	
}
