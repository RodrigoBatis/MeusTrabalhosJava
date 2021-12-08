package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class DadosContatos {

	//Atributos:
	Contato contato = new Contato();
	ArrayList<Contato> contatos = new ArrayList<Contato>();
	
	//M�tados:
	
	public void cadastrarContato(Contato c) {
		
		contatos.add(c);
		
	}
	
	public ArrayList<Contato> listarContatos() {
		
		return contatos;
		
	}
	
	public int totalContatos() {
		
		return contatos.size();
		
	}
	
}
