package bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import business.UsuarioBusiness;
import domain.Usuario;
import service.Sessao;

public class TelaPrincipalBean {

	private Usuario usuario;
	private UsuarioBusiness business = new UsuarioBusiness();

	public TelaPrincipalBean() {
		usuario = new Usuario();
	}

	public void verifica() throws IOException {
		System.out.println(usuario.getLogin());
		System.out.println(usuario.getSenha());
		Usuario verificaUsuario = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verificaUsuario != null) {
			//usuario = business.getUsuario(usuario.getLogin());
			Sessao.setUsuario(verificaUsuario);
			usuario = Sessao.getUsuario();
			FacesContext.getCurrentInstance().getExternalContext().redirect("homeLogado.xhtml");
		} else {
			FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Alerta",  "Não existe esse usuário cadastrado") );
			//FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		}

	}

	public void navBarPaginaInicial() throws IOException {
		isLogado();
	}

	public void navBarCardapio() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("cardapio.xhtml");
	}


	public void isLogado() throws IOException {
		if (usuario.getNome() != null) {
			FacesContext.getCurrentInstance().getExternalContext().redirect("homeLogado.xhtml");
		} else {
			FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		}
	}

	public void sairDoSistema() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
		usuario = new Usuario();
		Sessao.setUsuario(null);
	}

	public void teste() throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect("entregas.xhtml");
		System.out.println("cavaloooooooooooo");
	}

	public Usuario getUsuario() {
		if(this.usuario == null){
			this.usuario = Sessao.usuario;
		}
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
