package br.senai.sp.jandira.model;

public class Tabuada {
	
	private double multiplicado;
	private double multiplicadorMaximo;
	private int contador = 0;
	
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
	
	
	public void setCalcularTabuada(int calcularTabuada) {
		while (contador < multiplicadorMaximo) {
			 
			contador++;
			
			double multiplicacao = getMultiplicado() *  getMultiplicadorMaximo();
			
			System.out.println(multiplicado + "X" + multiplicadorMaximo + "=" + multiplicacao);
		} 
	}
	
	
	
}
