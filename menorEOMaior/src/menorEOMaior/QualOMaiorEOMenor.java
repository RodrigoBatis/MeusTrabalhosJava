package menorEOMaior;

import java.util.Scanner;

public class QualOMaiorEOMenor {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = leitor.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = leitor.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = leitor.nextInt();
		
		leitor.close();
		
		if ( n3 < n1 ) {
			if (n3 < n1) {
				System.out.println("O menor numero é: " + n3);
			}else {
				System.out.println("O menor numero é: " + n1);
			}
		}else {
			if (n1 < n2) {
				System.out.println("O menor numero é: " + n1);
			}else {
				System.out.println("O menor numero é: " + n2);
			}
		}

	}

}
