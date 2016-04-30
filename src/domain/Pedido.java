package domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Pedido")
public class Pedido {

	@Id
	@GeneratedValue
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Usuario usuario;
	
	@OneToMany (cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Produto> produtos;
	private boolean status;
	
	public Pedido() {
		
	}
	
	public Pedido(Usuario usuario, List<Produto> produtos, boolean status) {
		super();
		this.usuario = usuario;
		this.produtos = produtos;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
