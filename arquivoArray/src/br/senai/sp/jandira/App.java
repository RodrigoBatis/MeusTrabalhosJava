package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Arquivo;
import br.senai.sp.jandira.model.Contato;
import br.senai.sp.jandira.model.DadosContatos;
import br.senai.sp.jandira.ui.TelaContato;

public class App {

	public static void main(String[] args) {
		
		TelaContato tela = new TelaContato();
		tela.setVisible(true);
		
		/*Arquivo objArquivo = new Arquivo();
		String caminho = "Z:\\Contato\\Contatos.txt";
		
		DadosContatos objDadosContato = new DadosContatos();
		
		Contato objContato1 = new Contato("Ana","ana@gmail.com","1111-2222","Jandira");
		Contato objContato2 = new Contato("João","joão@gmail.com","3333-4444","Osasco");
		Contato objContato3 = new Contato("Maria","maria@gmail.com","5555-6666","Barueri");
		Contato objContato4 = new Contato("José","josé@gmail.com","7777-8888","Itapevi");
		
		objDadosContato.cadastrarContato(objContato1);
		objDadosContato.cadastrarContato(objContato2);
		objDadosContato.cadastrarContato(objContato3);
		objDadosContato.cadastrarContato(objContato4);
		
		String texto ="";
		
		for(Contato c : objDadosContato.listarContatos()) {
			
			//System.out.println("Nome: " + c.getNome() + " E-mail: " + c.getEmail() + " Telefone: " + c.getTelefone() + " Cidade: " + c.getCidade());
			
			texto += c.getNome() + ";" + c.getEmail() + ";" + c.getTelefone() + ";" + c.getCidade() + "\n";
			
		}
		
		//System.out.println(texto);
		objArquivo.escrever(caminho, texto);
		*/
	}

}
