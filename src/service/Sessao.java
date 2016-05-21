package service;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import domain.Usuario;

@ManagedBean
@SessionScoped
public class Sessao {
	
	private static Usuario usuario = new Usuario();
	private String nomeUsuarioLogado;
	
	public void guardarUsuario(Usuario usuarioRecebido) {
		setUsuario(usuarioRecebido);
		nomeUsuarioLogado = usuarioRecebido.getNome();
	}

	public void limparSessao() {
		setUsuario(new Usuario());
		nomeUsuarioLogado = null;
	}

	public static Usuario getUsuario() {
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		Sessao.usuario = usuario;
	}

	public String getNomeUsuarioLogado() {
		return nomeUsuarioLogado;
	}

	public void setNomeUsuarioLogado(String nomeUsuarioLogado) {
		this.nomeUsuarioLogado = nomeUsuarioLogado;
	}
}
