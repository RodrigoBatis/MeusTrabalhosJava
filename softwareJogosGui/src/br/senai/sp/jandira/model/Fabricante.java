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
		public void setAnoInauguração(String anoInauguração) {
			this.anoInauguracao = anoInauguração;
		}
		public String getAnoInauguração() {
			return anoInauguracao;
		}
		public void setLocalizacao(String localizacao) {
			this.localizacao = localizacao;
		}
		public String getLocalizacao() {
			return localizacao;
		}
				
}
