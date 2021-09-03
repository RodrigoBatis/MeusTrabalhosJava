package valorComissão;

import java.util.Scanner;

public class Commissão {

	public static void main(String[] args) {
		
		String nome;
		double valorVendas, tempoTrabalho, comissao;
		
		Scanner ler = new Scanner (System.in);
				
		System.out.print("Nome do vendedor: ");
		nome = ler.next();
		
		System.out.print("Qual a quantidade de vendas: ");
		valorVendas = ler.nextDouble();
		
		System.out.print("Qual seu tempo de trabalho: ");
		tempoTrabalho = ler.nextDouble();
		
		ler.close();

		// Calcular a comissão do vendedor
		
		if (valorVendas >= 20000 && tempoTrabalho >= 1) {
			comissao = valorVendas * 10 / 100;
			System.out.println("A pessoa vai receber a comissao de: " + comissao);
		} else if (valorVendas >= 10000 && tempoTrabalho >= 1) {
			comissao = valorVendas * 5 / 100;
			System.out.println("A pessoa vai receber a comissao de: " + comissao);
		} else {
			comissao = valorVendas * 3 /100;
			System.out.println("A pessoa vai receber a comissao de: " + comissao);
		}
		
		
	}

}
