package br.senai.sp.jandira.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Arquivo {
	
	DadosContatos objDadosContato = new DadosContatos();

	public boolean escrever(String caminho, String conteudo) {
		
		try {
			
			FileWriter arquivo = new FileWriter(caminho);
			PrintWriter escraverArquivo = new PrintWriter(arquivo);
			
			escraverArquivo.append(conteudo);
			escraverArquivo.close();
			
			return true;
			
			
		}catch(IOException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			
			return false;
			
		}
		
	}
	
	public DadosContatos ler(String caminho) {
		
		String conteudo = "";
		
		try {
			// Abre o arquivo
			FileReader arquivo = new FileReader(caminho);
			
			// Armazena o conteudo do arquivo em memoria 
			BufferedReader conteudoArquivo = new BufferedReader(arquivo);
			
			//recupera os dados do arquivo
			
			try {
			String linha = "";
			linha = conteudoArquivo.readLine();
			
			while(linha != null) {
				
				Contato objContato = new Contato();
				
				String[] vetLinha = linha.split(";");
				
				objContato.setNome(vetLinha[0]);
				objContato.setEmail(vetLinha[1]);
				objContato.setTelefone(vetLinha[2]);
				objContato.setCidade(vetLinha[3]);
				
				objDadosContato.cadastrarContato(objContato);
				
				//conteudo = conteudo + linha;
				linha = conteudoArquivo.readLine();
				
			}
			
			conteudoArquivo.close();
			return objDadosContato;
			
			}catch(IOException e) {
				System.out.println("ERRO: " + e.getMessage());
				return null;
			}
		}catch(FileNotFoundException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			return null;
		}
		
	}
	
}
