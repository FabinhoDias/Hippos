package service;

import domain.Usuario;

public class Sessao {
	
	public static Usuario usuario;

	
	
	public static Usuario getUsuario() {
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		Sessao.usuario = usuario;
	}

}
