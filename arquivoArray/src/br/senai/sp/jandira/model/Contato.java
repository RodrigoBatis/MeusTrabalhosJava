package br.senai.sp.jandira.model;

public class Contato {

	private String nome;
	private String email;
	private String telefone;
	private String cidade;
	
	public Contato(String nome, String email, String telefone, String cidade) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
	}
	
	public Contato() {}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	
}
