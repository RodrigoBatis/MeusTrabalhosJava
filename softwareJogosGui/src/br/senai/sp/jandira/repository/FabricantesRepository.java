package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricantesRepository {
	
	private Fabricante[] listaFabricantes;
	
	public FabricantesRepository(int quantidadeFabricantes) {
		listaFabricantes = new Fabricante[quantidadeFabricantes];
	}
	
	public void gravar(Fabricante fabricante, int posicao) {
		listaFabricantes[posicao] = fabricante;
	}
	
	public Fabricante listarFabricante(int posicao) {
		return listaFabricantes[posicao];
	}
	
	public Fabricante[] listarTodos() {
		return listaFabricantes;
	}
	
	public int getTamanho() {
		return listaFabricantes.length;
	}
}
