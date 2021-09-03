package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 

		int multiplicado, multiplicadorMaximo;
		int contador = 0;
		
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println("* * * * * * * * * * Tabuada * * * * * * * * * * * ");
		System.out.println("-------------------------------------------------");
		System.out.println("");
				
		System.out.print("digite o multiplicado: ");
		multiplicado = ler.nextInt();
				
		System.out.println("");
				
		System.out.print("digite o multiplicador: ");
		multiplicadorMaximo = ler.nextInt();
				
		System.out.println("");
		
		ler.close();
		
		System.out.println("-------------------------------------------------");
		while (contador < multiplicadorMaximo) {
			
			contador ++ ;
			
			int mult = multiplicado * contador;
			
			System.out.println(multiplicado + " X " + contador + " = " + mult);
		}
		System.out.println("-------------------------------------------------");
		System.out.println("              ***** F I M *****                  ");
		System.out.println("-------------------------------------------------");
	}

}
