package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.repository.FabricantesRepository;

public class App {

	public static void main(String[] args) {
		
		FabricantesRepository fabricantes = new FabricantesRepository(5);
		
		Fabricante a = new Fabricante();
		a.setNome("Supercell");
		a.setLocalizacao("Helsinque-Finl�ndia");
		a.setInaugura��o("junho de 2010");
		
		Fabricante b = new Fabricante();
		b.setNome("Epic Games");
		b.setInaugura��o("15 de janeiro de 1991");
		b.setLocalizacao("California-Estadus Unidos");
		
		Fabricante c = new Fabricante();
		c.setNome("Sony");
		c.setInaugura��o("7 de maio de 1946");
		c.setLocalizacao("Toquio-Jap�o");
		
		Fabricante d = new Fabricante();
		d.setNome("Nintendo");
		d.setInaugura��o("23 de setembro de 1889");
		d.setLocalizacao("Quioto-Jap�o");
		
		Fabricante e = new Fabricante();
		e.setNome("Microsoft");
		e.setInaugura��o("4 de abril de 1975");
		e.setLocalizacao("Washington-Estados Unidos");
		
		
		
		}
	}


