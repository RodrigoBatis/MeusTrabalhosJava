package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogosRepository {

	private Jogo[] colecaoJogos;
	
	public JogosRepository(int quantidadeJogos) {
		colecaoJogos = new Jogo[quantidadeJogos];
	}
	
	public void gravar(Jogo jogo, int posicao) {
		colecaoJogos[posicao] = jogo;
	}
	
	public Jogo listarJogo(int posicao) {
		return colecaoJogos[posicao];
	}
	
	public Jogo[] listarTodos() {
		return colecaoJogos;
	}
	
	public int getTamanho() {
		return colecaoJogos.length;
	}
	
	
}
