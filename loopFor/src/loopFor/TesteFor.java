package loopFor;

import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		
		System.out.println("Looping WHILE");
		System.out.println("");
		
		// utilizando while
		
		int i = 0;
		
		while  (i < 10) {
			System.out.println(i + " - ");
			i++;
		}
		
		System.out.println("");
		System.out.println("Looping FOR");
		System.out.println("");
		
		// utilizando for
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x + " - Frase qualquer");
		}
		
		System.out.println("");
		System.out.println("****************");
		System.out.println("* Tabuada do 8 *");
		System.out.println("****************");
		System.out.println("");
		
		int numero = 8, multiplicador = 10;
		
		System.out.println("**************");
		System.out.println("* Resultados *");
		System.out.println("**************");
		
		for (int contador = 0; contador <= multiplicador; contador++) {
			System.out.println("8 X " + contador + " = " + numero * contador);
		}
		
		System.out.println("");
		System.out.println("**********");
		System.out.println("* FIM !! *");
		System.out.println("**********");
		
		System.out.println("");
		
		// Teste com comdição String
		
		Scanner leitor = new Scanner(System.in);
		String resposta = "S";
	
		for (int a = 0; resposta.equalsIgnoreCase("S"); a++) {
			System.out.println("Volta " + a);
			System.out.print("Continuar (S/N)? ");
			resposta = leitor.next();
		}
		System.out.println("");
		System.out.println("**********");
		System.out.println("* finish *");
		System.out.println("**********");
		
		}
	}


