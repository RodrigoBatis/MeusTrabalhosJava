package AreaDeUmaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nomeComodo, escolha;
		double largura, comprimento, metrosQuadrados;
		int contador = 0;
		
		System.out.println("-------------------------------------------------");
		System.out.println("          Calculo de �rea de uma casa            ");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		System.out.print("Qual o nome do c�modo? ");
		nomeComodo = ler.next();
		System.out.println("");
		
		System.out.print("Qual a largura ");
		largura = ler.nextDouble();
		System.out.println("");
		
		System.out.print("Qual o comprimento? ");
		comprimento = ler.nextDouble();
				
		metrosQuadrados = largura * comprimento;
		
		System.out.println("");
		System.out.println("A " + nomeComodo + " tem " + metrosQuadrados + " metros quadrados.");
		
		System.out.println("");
		System.out.print("Voc� deseja calcular mais c�modos(S/N)? ");
		escolha = ler.next();
		System.out.println("");
		
		ler.close();
		
		while (escolha.equals("S") || escolha.equals("s")) {
			
		}
		
		
		
		
	}
	

}
