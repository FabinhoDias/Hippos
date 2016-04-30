package domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="Usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String login;
	private String senha;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String login, String senha, Endereco endereco) {
		super();
		this.nome = nome;
		this.login = login;
		this.senha = senha;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
