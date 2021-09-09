package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random sorteio = new Random();
		
		int jogador, maquina, quantidadeRodadas, contador;
		contador = 0;
		String escolha = "S";
		
		System.out.println("-------------------------------------------------");
		System.out.println("                 J O K E N P O                   ");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		System.out.print("Quantas partidas: ");
		quantidadeRodadas = ler.nextInt();
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println(" 1 - Pedra");
		System.out.println(" 2 - Papel");
		System.out.println(" 3 - Tesoura");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		
	}

}
