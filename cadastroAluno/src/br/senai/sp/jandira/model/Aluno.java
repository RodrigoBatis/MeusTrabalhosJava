package br.senai.sp.jandira.model;

public class Aluno {

	private String nome;
	private String matricula;
	private Periodo periodo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
	public Periodo getPeriodo() {
		return periodo;
	}
	
	
	
}
