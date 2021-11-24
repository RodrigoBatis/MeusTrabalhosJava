package br.senai.sp.jandira.model;

public class Jogo {
		
		private String titulo;
		private Fabricante fabricante;
		private Boolean zerado;
		private Console console;
		private double valor;
		private String observacao;
		
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getTitulo() {
			return titulo;
		}
		
		public void setFabricante(Fabricante fabricante) {
			this.fabricante = fabricante;
		}
		
		public Fabricante getFabricante() {
			return fabricante;
		}
		
		public void setZerado(Boolean zerado) {
			this.zerado = zerado;
		}
		
		public Boolean getZerado() {
			return zerado;
		}
		
		public void setConsole(Console console) {
			this.console = console;
		}
		
		public Console getConsole() {
			return console;
		}
		
		public void setValor(String valorString) {
			double valor = Double.parseDouble(valorString);
			this.valor = valor;
		}
		
		public String getValor() {
			String valorString = String.valueOf(this.valor);
			return valorString;
		}
		
		public void setObservacao(String observacao) {
			this.observacao = observacao;
		}
		
		public String getObservacao() {
			return observacao;
		}
		
		
		
}
