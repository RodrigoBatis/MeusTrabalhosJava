package br.senai.sp.jandira.model;


public class Tabuada {
	
	private int multiplicado;
	private int multiplicadorMaximo;
	
	
	
	public void setMultiplicado(int multiplicado) {
		this.multiplicado = multiplicado;
	}
	
	public double getMultiplicado() {
		return multiplicado;
	}
	
	public void setMultiplicadorMaximo(int multiplicadorMaximo) {
		this.multiplicadorMaximo = multiplicadorMaximo;
	}
	
	public double getMultiplicadorMaximo() {
		return multiplicadorMaximo;
	}
	
	public String[]calcular(){
		
		String tabuada[] = new String[multiplicadorMaximo + 1];
		
		for (int index = 0; index <= multiplicadorMaximo; index++) {
			int produto = multiplicado * index;
			
			tabuada[index]= multiplicado + " X " + index + " = " + produto;
		}
		
		return tabuada;
		
	}
	
	
	
}
