package qualMenorValor;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		Scanner leitor = new Scanner(System.in);
				
		System.out.print("Digite o primeiro n�mero: ");
		numero1 = leitor.nextInt();
		
		System.out.print("Digite o primeiro n�mero: ");
		numero2 = leitor.nextInt();
				 
		leitor.close();

		System.out.println();
		if (numero1 < numero2) {
			System.out.println("O menor valor �: " + numero1);
		if (numero1 % 2 == 1) {
			System.out.println("O valor " + numero1 + " � impar!");
		} else {
			System.out.println("O valor " + numero1 + " � par!");
		}
		
		}else {
			System.out.println("O menor valor �: " + numero2);
			if (numero2 % 2 == 1 ) {
				System.out.println("O valor " + numero2 + " � impar!");
			} else {
				System.out.println("O valor " + numero2 + " � par!");
			}
		}
		
		
	}

}
