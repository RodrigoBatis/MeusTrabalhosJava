package br.senai.sp.jandira.model;

public enum Console {
	
		XBOX360("Xbox360", 1100.00),
		XBOXONE("XboxOne", 2300.00),
		PLAYSTATION2("Playstation2", 900.00),
		PLAYSTATION3("Playstation3", 1500.00),
		PLAYSTATION4("Playstation4", 3000.00),
		PLAYSTATION5("Playstation5", 6000.00);
		
	private String descricao;
	
	private Console(String descricao, double i){this.descricao = descricao;}
	
	 public String getDescricao(){return descricao;}
}
