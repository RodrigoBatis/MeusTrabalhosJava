package qualMenorValor;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner leitor = new Scanner(System.in);
				
		System.out.print("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o primeiro número: ");
		numero2 = leitor.nextInt();
				 
		leitor.close();

		System.out.println();
		if (numero1 < numero2) {
			System.out.println("O menor valor é: " + numero1);
		if (numero1 % 2 == 1) {
			System.out.println("O valor " + numero1 + " é impar!");
		} else {
			System.out.println("O valor " + numero1 + " é par!");
		}
		
		}else {
			System.out.println("O menor valor é: " + numero2);
			if (numero2 % 2 == 1 ) {
				System.out.println("O valor " + numero2 + " é impar!");
			} else {
				System.out.println("O valor " + numero2 + " é par!");
			}
		}
		
		
	}

}
