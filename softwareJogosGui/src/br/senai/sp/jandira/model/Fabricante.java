package br.senai.sp.jandira.model;

public class Fabricante {
		
		private String nome;
		private String anoInauguracao;
		private String localizacao;
		
		public Fabricante(String nome, String localizacao, String anoInauguracao) {
			this.nome = nome;
			this.localizacao = localizacao;
			this.anoInauguracao = anoInauguracao;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public void setAnoInaugura��o(String anoInaugura��o) {
			this.anoInauguracao = anoInaugura��o;
		}
		public String getAnoInaugura��o() {
			return anoInauguracao;
		}
		public void setLocalizacao(String localizacao) {
			this.localizacao = localizacao;
		}
		public String getLocalizacao() {
			return localizacao;
		}
				
}
