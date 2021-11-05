package br.senai.sp.jandira.model;

public enum Periodo {

	MANHA("Manh�"), 
	TARDE("Tarde"), 
	NOITE("Noite"), 
	SABADO("S�bado");
	
	private String descricao;

	private Periodo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
}
