package pedraPapelTesoura;


import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random sorteio = new Random(); 
		
		int jogador, maquina;
		
		System.out.println("-------------------------------------");
		System.out.println("          PedraPapelTesoura          ");
		System.out.println("-------------------------------------");
		System.out.println("");
		
		System.out.println("******* Escolha uma das opções *******");
		System.out.println("");
		System.out.println("[1] = Pedra");
		System.out.println("[2] = Papel");
		System.out.println("[3] = Tesoura");
		System.out.println("");
		
		System.out.print("Qual sua escolha? ");
		jogador = ler.nextInt();
		
		ler.close();
		
		System.out.println("");
		System.out.println("-------------------------------------");
		maquina = sorteio.nextInt(3) + 1;
		System.out.print("        A maquina escolheu ");
		System.out.println(maquina);
		System.out.println("-------------------------------------");
		System.out.println("");
		
		System.out.println("-------------------------------------");
		System.out.println("");
		if ((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2))  {
			System.out.println("       ***** Você ganhou *****");
		}else if ((maquina == 1 && jogador == 3) || (maquina == 2 && jogador == 1) || ( maquina == 3 && jogador == 2)) {
			System.out.println("       ***** Você perdeu *****");
		}else
			System.out.println("       ***** Deu empate *****");
		
		System.out.println("");
		System.out.println("-------------------------------------");
	}

}
