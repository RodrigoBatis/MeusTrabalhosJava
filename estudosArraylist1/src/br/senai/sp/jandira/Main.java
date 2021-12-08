package br.senai.sp.jandira;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		String texto1 = "PROGRAMAÇÃO ORIENTADA A OBJETO";
		String texto2 = "JAVA-SE";
		String texto3 = "SENAI-JANDIRA";
		
		//criação de um objeto do tipo Arraylist de Strings
		ArrayList<String> dados = new ArrayList<String>();
		
		//adicionando valores no Arraylist dados
		dados.add(texto1);//0
		dados.add(texto2);//1
		dados.add(texto3);//2
		
		//REMOVENDO ELEMENTO DE UMA ARRAYLIST
		//dados.remove(1);
		
		if (dados.isEmpty()) {
			System.out.println("O ARRAYLIST ESTÁ VAZIO!");
		}else {
			System.out.println("ESTE ARRAYLIST POSSUI DADOS: "+ dados.size());
			System.out.println("Dados: " + dados);
			
			System.out.println("Indice 0: " + dados.get(0));
			System.out.println("Indice 1: " + dados.get(1));
			System.out.println("Indice 2: " + dados.get(2));
			System.out.println("");
		}
		
		//MANIPULANDO ARRAYLIST COM USO DE LOOPS DE REPETIÇÃO
		
		//LOOP FOR:
		System.out.println("########## LOOP FOR ##########");
		for (int i = 0; i < dados.size(); i++) {
			
			System.out.println("INDICE: " + i + " VALOR: " + dados.get(i) );
		}
		
		//LOOP FORECH:
		System.out.println("");
		System.out.println("########## LOOP FORECH ##########");
		for(String dado : dados) {
			System.out.println("VALOR: " + dado);
		}
		
		//LOOP FORECH COM LAMBIDA:
		System.out.println("");
		System.out.println("########## MÉTODO FORECH DO ARRAYLIST COM LAMBDA ##########");
		dados.forEach(dado->{
			System.out.println("VALOR: " + dado);
		});
	}

}
