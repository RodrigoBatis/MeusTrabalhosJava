package mediaFinal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		String nome;
		double n1, n2, n3, n4, media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Nome do aluno ");
		nome = leitor.next();
		
		System.out.print("Digite a primeira nota: ");
		n1 = leitor.nextDouble();

		System.out.print("Digite a segunda nota: ");
		n2 = leitor.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		n3 = leitor.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		n4 = leitor.nextDouble();
		
		leitor.close();
		
		// Calcular a média do aluno
		
		media = (n1 + n2 + n3 + n4)/4;
		System.out.println();
		System.out.println("A média do(a) aluno(a) " + nome + " é: " + media);
		// Verificar a situação do aluno
		System.out.println();
		if (media >= 6) {
			System.out.println("*** A P R O V A D O ***");
		} else if (media < 4) {
			System.out.println("*** R E P R O V A D O ***");
		} else
			System.out.println("*** R E C U P E R A Ç Ã O ***");
		}
		
	}


