package leitura;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);//Classe = Receita
		int primeiroNumero;
		int segundoNumero;
		int resultado;
		String nome;
		
		System.out.print("Qual o primeiro numero? ");
		primeiroNumero = leitor.nextInt();
		
		System.out.print("Qual o segundo numero? ");
		segundoNumero = leitor.nextInt();
		
		System.out.print("Qual seu nome? ");
		nome = leitor.next();
		
		leitor.close();
		
		resultado = primeiroNumero + segundoNumero;
		System.out.println("Olá " + nome);		
		System.out.println("Resultado: " + resultado);	
		
		
		
		
		
		
	}

}
