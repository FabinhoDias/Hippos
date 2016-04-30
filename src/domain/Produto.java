package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Produto")
public class Produto {

	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private double valor;
	private String categoria;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double valor, String categoria) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
