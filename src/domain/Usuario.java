package domain;

import java.util.ArrayList;
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
@Table (name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private String login;
	private String senha;
	
	@OneToMany (cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Pedido> pedidos;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	public Usuario() {
		
	}

	public Usuario(String nome, String login, String senha, List<Pedido> pedidos, Endereco endereco) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.pedidos = pedidos;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Pedido> getPedidos() {
		if (this.pedidos == null) {
			this.pedidos = new ArrayList<Pedido>();
		}
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
