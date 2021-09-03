package eleicaoSindical;

import java.util.Scanner;

public class EleicaoSindical {

	public static void main(String[] args) {
		
		System.out.println("Eleição Sindical");
				
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro candidato: ");
		String candidato1 = ler.next();

		System.out.print("Digite o segundo candidato: ");
		String candidato2 = ler.next();
		
		System.out.print("Digite o terceiro candidato: ");
		String candidato3 = ler.next();
		
		System.out.println("******** Apuração ********");
		
		System.out.print("Total de votos para: " +  candidato1 + ": ");
		double votos1 = ler.nextDouble();
		
		System.out.print("Total de votos para: " +  candidato2 + ": ");
		double votos2 = ler.nextDouble();
		
		System.out.print("Total de votos para: " +  candidato3 + ": ");
		double votos3 = ler.nextDouble();
		
		System.out.print("Total de votos nulos: ");
		double votosNulos = ler.nextDouble();
		
		System.out.print("Total de votos brancos: ");
		double votosBrancos = ler.nextDouble();
		
		System.out.println("*****************************************");
		System.out.println("Resultados");
		System.out.println("*****************************************");
		
		double totalDeEleitores = votos1 + votos2 + votos3 + votosNulos + votosBrancos;
		System.out.println("Total de eleitores: " + totalDeEleitores );
		
		double porcentualDeVotosCandidato1 = (votos1/totalDeEleitores)*100;
		double porcentualDeVotosCandidato2 = (votos2/totalDeEleitores)*100;
		double porcentualDeVotosCandidato3 = (votos3/totalDeEleitores)*100;
		
		
		System.out.println("Percentual de Votos " + candidato1 + ":" + porcentualDeVotosCandidato1 + "%" );
		System.out.println("Percentual de Votos " + candidato2 + ":" + porcentualDeVotosCandidato2 + "%" );
		System.out.println("Percentual de Votos " + candidato3 + ":" + porcentualDeVotosCandidato3 + "%" );
		
		ler.close();
		
		System.out.println("");
		System.out.println("Fim");
		System.out.println("");
		System.out.println("*************************************************");
		
		}	

}
