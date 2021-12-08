package br.senai.sp.jandira.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Arquivo {

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
	
	public String ler(String caminho) {
		
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
				
				//conteudo = conteudo + linha;
				conteudo += linha;
				linha = conteudoArquivo.readLine();
				
			}
			
			conteudoArquivo.close();
			return conteudo;
			
			}catch(IOException e) {
				System.out.println("ERRO: " + e.getMessage());
				return "";
			}
		}catch(FileNotFoundException e) {
			
			System.out.println("ERRO: " + e.getMessage());
			return "";
		}
		
	}
	
}
