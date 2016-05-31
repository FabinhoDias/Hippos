package business;

import dao.UsuarioDAO;
import domain.Usuario;

public class UsuarioBusiness {

	UsuarioDAO dao = new UsuarioDAO();

	public Usuario validar(String login, String senha) {
		Usuario usuario = dao.verificaUsuario(login, senha);
		if (usuario == null) {
			return null;
		} else {
			return usuario;
		}
	}

	public boolean salvar(Usuario usuario) {
		if (dao.buscarUsuario(usuario.getLogin()) != null) {
			return false;
		} else {
			dao.salvarUsuario(usuario);
			return true;
		}
	}

	public void atualizar(Usuario usuario) {
		dao.atualizarUsuario(usuario);
	}

	public boolean excluir(Usuario usuario) {
		return dao.removerUsuario(usuario);

	}

	/*
	 * public List<Usuario> getListaDeUsuario() { return dao.list(); }
	 */

	public Usuario getUsuario(String login) {
		return dao.buscarUsuario(login);
	}

}
