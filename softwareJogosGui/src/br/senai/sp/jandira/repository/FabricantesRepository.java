package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricantesRepository {
	
	private Fabricante[] listaFabricantes;
	
	public FabricantesRepository() {
		
		this.listaFabricantes = new Fabricante[8];
		
		listaFabricantes[0] = new Fabricante("Sony","T�quio-Jap�o", "1946");
		listaFabricantes[1]	= new Fabricante("Nintendo","Kyoto-Jap�o","1889");
		listaFabricantes[2] = new Fabricante("Microsoft","Redmond, Washingto-EUA","1975");
		listaFabricantes[3] = new Fabricante("Electronic Arts","Redwood City, Calif�rnia-EUA","1982");
		listaFabricantes[4] = new Fabricante("EPIC Games","Cary, Carolina do Norte-EUA","1991");
		listaFabricantes[5] = new Fabricante("Bandai Namco", "T�quio-Jap�o", "2005");
		listaFabricantes[6] = new Fabricante("Tencent", "Shenzhen-China", "1998");
		listaFabricantes[7] = new Fabricante("Konami", "T�quio-Jap�o", "1969");
	}
	
	public Fabricante[] getFabricantes() {
		return listaFabricantes;
	}

	public void setFabricantes(Fabricante[] fabricantes) {
		this.listaFabricantes = fabricantes;
	}
	
	public Fabricante listarFabricante(int posicao) {
		return listaFabricantes[posicao];
	}
	
	public int getLegth() {
		return listaFabricantes.length;
	}
	
}
