package bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLWriter;

import org.apache.tomcat.util.http.fileupload.RequestContext;

import business.UsuarioBusiness;
import domain.Endereco;
import domain.Usuario;

@ManagedBean
@SessionScoped
public class TelaCadastroBean {
	
	private Usuario usuario = new Usuario();
	private Endereco endereco = new Endereco();
	private UsuarioBusiness business = new UsuarioBusiness();
	private int status;
	
	public String verificaCadastro() {
		
		boolean verifica = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verifica) {
			//showMessages()
			System.out.println("Passou aqui!");
		} else {
			cadastrar();
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "What we do in life", "Echoes in eternity.");
	         
	        //RequestContext.class.getCurrentInstance().showMessageInDialog(message);
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
			
		}
		return "home.jsp";
	}
	
	public void info() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "PrimeFaces Rocks."));
    }
	
	public void cadastrar() {
		usuario.setEndereco(endereco);
		business.salvar(usuario);
		usuario = new Usuario();
		endereco = new Endereco();
		status = 0;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
