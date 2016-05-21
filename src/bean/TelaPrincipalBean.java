package bean;

import java.io.IOException;
import javax.faces.context.FacesContext;

import business.UsuarioBusiness;
import domain.Usuario;
import service.Sessao;

public class TelaPrincipalBean {

	private Usuario usuario;
	private UsuarioBusiness business = new UsuarioBusiness();
	private String nomeDoUsuarioLogado = "";

	private String navBar = "P";

	public TelaPrincipalBean() {
		usuario = new Usuario();
	}

	public void verifica() throws IOException {
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		boolean verifica = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verifica) {
			usuario = business.getUsuario(usuario.getLogin());
			nomeDoUsuarioLogado = usuario.getNome();
			FacesContext.getCurrentInstance().getExternalContext().redirect("homeLogado.xhtml");
		} else {
			System.out.println("Não Passou");
			FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		}

	}

	public void navBarPaginaInicial() throws IOException {
		isLogado();
		System.out.println(nomeDoUsuarioLogado);
	}

	public void navBarCardapio() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("cardapio.xhtml");
	}

	public void navBarEntregas() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("entregas.xhtml");
	}

	public void isLogado() throws IOException {
		if (nomeDoUsuarioLogado != "") {
			FacesContext.getCurrentInstance().getExternalContext().redirect("homeLogado.xhtml");
		} else {
			FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		}
	}

	public void sairDoSistema() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		nomeDoUsuarioLogado = "";
	}

	public void teste() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("homeLogado.xhtml");
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNomeDoUsuarioLogado() {
		return nomeDoUsuarioLogado;
	}

	public void setNomeDoUsuarioLogado(String nomeDoUsuarioLogado) {
		this.nomeDoUsuarioLogado = nomeDoUsuarioLogado;
	}

}
