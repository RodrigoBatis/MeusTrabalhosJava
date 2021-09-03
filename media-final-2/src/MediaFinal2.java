import java.util.Scanner;

public class MediaFinal2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double nota1Bim, nota2Bim, nota3Bim, nota4Bim, media;

		
		System.out.print("Nome do(a) aluno(a): ");
		String nome = leitor.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1Bim = leitor.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2Bim = leitor.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3Bim = leitor.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4Bim = leitor.nextDouble();
		
		leitor.close();
		
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("R E S U L T A D O");
		System.out.println("----------------------------");
		System.out.println("");
		
		media = (nota1Bim + nota2Bim + nota3Bim + nota4Bim)/4;
		
		
		System.out.println("O(a) aluno(a) " + nome + " ficou com média " + media);
		
		if (media >= 6.0) {
			System.out.println("*** A P R O V A D O!! ***");
		} else {
			System.out.println("*** R E P R O V A D O!! ***");
		}
		
	}

}
