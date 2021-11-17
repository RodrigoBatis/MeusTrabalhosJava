package br.senai.sp.jandira.model;

public enum Console {
	
		XBOX360("Xbox360", 1.100),
		XBOXONE("XboxOne", 2.300),
		PLAYSTATION2("Playstation2", 900),
		PLAYSTATION3("Playstation3", 1.500),
		PLAYSTATION4("Playstation4", 3.000),
		PLAYSTATION5("Playstation5", 6.000);
		
	private String descricao;
	private double descricaoPreco;

	private Console (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

	private Console(String precos, double descricaoPreco) {
		this.descricaoPreco = descricaoPreco;
	}
	
	public double getDescricaoPreco() {
		return descricaoPreco;
	} 
	
}
