package AreaDeUmaCasa;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		String nomeComodo, escolha;
		double largura, comprimento, totalArea, soma;
		
		
		System.out.println("-------------------------------------------------");
		System.out.println("          Calculo de área de uma casa            ");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		soma = 0;
		escolha = "S";
		
		System.out.println("-------------------------------------------------");
		while(escolha.equalsIgnoreCase("S")){
			System.out.print("Nome do cômodo?: ");
			nomeComodo = ler.next();
			
			System.out.println("");
			
			System.out.print("Qual a largura?: ");
			largura = ler.nextDouble();
			
			System.out.println("");
			
			System.out.print("Qual o comprimento?: ");
			comprimento = ler.nextDouble();
				
			totalArea = largura * comprimento;
			soma = soma + totalArea; 
			
			System.out.println("");
		
			System.out.print("Gostaria de adicionar um cômodo? [S/N] : ");
			escolha = ler.next();
		}
		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("A área total da casa é : " + soma);
		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("                ***** FIM *****                  ");
		System.out.println("-------------------------------------------------");				
	}
	

}
