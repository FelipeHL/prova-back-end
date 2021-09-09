package model;

import java.util.Objects;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private float valor;
	private float quantidade;
	
	public Produto() {
	}
	
	public Produto(int[] csv) {
		this.id = csv[0];
	}
	
	public Produto(int id, String nome, String descricao, float valor, float quantidade) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	public String toString() {
		return "\t" + id + "\t" + nome + "\t" + descricao + "\t" + valor + "\t" + quantidade;
	}
	
	public String toCSV() {
		return id + ";" + nome + ";" + descricao + ";" + valor  + ";" + quantidade + "\r\n";
	}
	
	public String toHTML() {
		return "<tr><td>"+ id + "</td><td>" + descricao + "</td><td>" + valor + "</td><td>" + quantidade + "</td></tr>";
	}

	public void add(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
