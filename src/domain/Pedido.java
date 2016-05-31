package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany (mappedBy="id", cascade = {CascadeType.PERSIST, CascadeType.MERGE }, fetch=FetchType.LAZY)
	private List<Produto> produtos;
	
	private String nomeUsuario;
	
	private Date data; 
	
	private String status;
	
	public Pedido() {
		
	}

	public Pedido(List<Produto> produtos, String nomeUsuario, Date data, String status) {
		super();
		this.produtos = produtos;
		this.nomeUsuario = nomeUsuario;
		this.data = data;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Produto> getProdutos() {
		if (this.produtos == null) {
			this.produtos = new ArrayList<Produto>();
		}
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		if (this.produtos == null) {
			this.produtos = new ArrayList<Produto>();
		}
		this.produtos = produtos;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	
}
