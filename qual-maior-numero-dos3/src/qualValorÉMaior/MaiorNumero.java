package qualValorÉMaior;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) 	{
	
		int n1, n2, n3;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = leitor.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = leitor.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		n3 = leitor.nextInt();
		
		leitor.close();
		
		if ( n1 > n3 ) {
			if (n1 > n3) {
				System.out.println("O maior numero é: " + n1);
			}else {
				System.out.println("O maior numero é: " + n3);
			}
		}else {
			if (n2 > n1) {
				System.out.println("O maior numero é: " + n2);
			}else {
				System.out.println("O maior numero é: " + n1);
			}
		}
	
	}
}


