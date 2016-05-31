package bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

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
	
	public void verificaCadastro() throws IOException {
		
		Usuario verificaUsuario = business.validar(usuario.getLogin(), usuario.getSenha());
		if (verificaUsuario != null) {
			//showMessages()
			System.out.println("Passou aqui!");
		} else {
			cadastrar();
			
			FacesContext context = FacesContext.getCurrentInstance();
			context.getExternalContext().redirect("home.xhtml");
	        //context.addMessage(null, new FacesMessage("Parabéns",  "Usuário cadastrado com sucesso") );
			
		}
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
