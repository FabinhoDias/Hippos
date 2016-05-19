package bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.tomcat.util.http.fileupload.RequestContext;

import business.UsuarioBusiness;
import domain.Usuario;

@ManagedBean
@SessionScoped
public class TelaCadastroBean {
	
	private Usuario usuario = new Usuario();
	private UsuarioBusiness business = new UsuarioBusiness();
	
	public void verificaCadastro() {
		
		boolean verifica = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verifica) {
			showMessages();
		} else {
			cadastrar();
		}
	}
	
	 public String showMessages(){

	        // adding info message
	        FacesMessage infoMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, 
	            "Info summary", "Info detail");
	        FacesContext.getCurrentInstance().addMessage("", infoMessage);
			return null;
	 }
	
	public void cadastrar() {
		business.salvar(usuario);
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
