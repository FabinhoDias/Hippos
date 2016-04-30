package bean;

import business.UsuarioBusiness;
import domain.Usuario;

public class TelaPrincipalBean {
	
	private String nomeUser = "Bem-vindo";
	private Usuario usuario;
	private UsuarioBusiness business = new UsuarioBusiness();
	public TelaPrincipalBean() {
		usuario = new Usuario();
	}
	public void verifica() {
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		boolean verifica = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verifica) {
			usuario = business.getUsuario(usuario.getLogin());
			System.out.println("Passou");
			nomeUser = "Bem-vindo " + usuario.getNome();
			//return usuario;
		} else {
			System.out.println("Não Passou");
			//return usuario;
		}
	}

	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
