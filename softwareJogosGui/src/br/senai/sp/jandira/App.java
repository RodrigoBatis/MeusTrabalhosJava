package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.repository.FabricantesRepository;

public class App {

	public static void main(String[] args) {
		
		FabricantesRepository fabricantes = new FabricantesRepository(5);
		
		Fabricante a = new Fabricante();
		a.setNome("Supercell");
		a.setLocalizacao("Helsinque-Finlândia");
		a.setInauguração("junho de 2010");
		
		Fabricante b = new Fabricante();
		b.setNome("Epic Games");
		b.setInauguração("15 de janeiro de 1991");
		b.setLocalizacao("California-Estadus Unidos");
		
		Fabricante c = new Fabricante();
		c.setNome("Sony");
		c.setInauguração("7 de maio de 1946");
		c.setLocalizacao("Toquio-Japão");
		
		Fabricante d = new Fabricante();
		d.setNome("Nintendo");
		d.setInauguração("23 de setembro de 1889");
		d.setLocalizacao("Quioto-Japão");
		
		Fabricante e = new Fabricante();
		e.setNome("Microsoft");
		e.setInauguração("4 de abril de 1975");
		e.setLocalizacao("Washington-Estados Unidos");
		
		
		
		}
	}


