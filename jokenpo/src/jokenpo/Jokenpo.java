package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random sorteio = new Random();
		
		int jogador, maquina, quantidadeRodadas, contador, rodadas, desempate;
		int  vitoriaJogador, vitoriaMaquina;
		String escolha = "S";
		
		System.out.println("-------------------------------------------------");
		System.out.println("                 J O K E N P O                   ");
		System.out.println("-------------------------------------------------");
		
		System.out.println("");
		
		System.out.println("-------------------------------------------------");
		System.out.println("Opções para escolha");
		System.out.println("-------------------------------------------------");
		
		System.out.println("");
		System.out.println("-------------------------------------------------");
		System.out.println(" 1 - Pedra");
		System.out.println(" 2 - Papel");
		System.out.println(" 3 - Tesoura");
		System.out.println("-------------------------------------------------");
		System.out.println("");
		
		while (escolha.equalsIgnoreCase("s")) {
			
			System.out.println("-------------------------------------------------");
			
			System.out.print("Quantas partidas: ");
			quantidadeRodadas = ler.nextInt();
			vitoriaJogador = 0;
			vitoriaMaquina = 0;
			contador = 0;
			maquina = sorteio.nextInt(3) + 1;
			System.out.println("-------------------------------------------------");
			
		while (contador < quantidadeRodadas) {
			while (quantidadeRodadas % 2 == 0 || quantidadeRodadas < 3) {
				System.out.println("Por favor não digite números pares ou menores que 3!");
				System.out.println();
				System.out.print("Digite a quantidade de rodadas: ");
				quantidadeRodadas = ler.nextInt();
			}
			System.out.println("");
			System.out.println("-------------------------------------------------");
			System.out.print("Qual sua escolha: ");
			jogador = ler.nextInt();
			System.out.println("-------------------------------------------------");
			
			if (jogador == 1) {
				System.out.println("Sua escolha foi pedra.");

			} else if (jogador == 2) {
				System.out.println("Sua escolha foi papel.");
				
			} else if (jogador == 3) {
				System.out.println("Sua escolha foi tesoura.");
				System.out.println("");
			}
				System.out.println("");
				System.out.println("Computador escolheu " + maquina );
				
				if (maquina == 1) {
					System.out.println("Computador escolheu pedra.");
					
				}else if (maquina == 2) {
					System.out.println("Computador escolheu papel.");
					
				}else if (maquina == 3) {
					System.out.println("Computador escolheu tesoura.");
					System.out.println("");
				}
					rodadas = quantidadeRodadas;
					System.out.println("");
			while (quantidadeRodadas != rodadas) {
				System.out.println("Escolha um valor de 1 até 3: ");
				System.out.println("");

				System.out.println("Escolha uma das opções: ");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("");

				System.out.println("------------------------");
				System.out.print("Qual sua escolha: ");
				jogador = ler.nextInt();
				System.out.println("------------------------");
				System.out.println("");
			}
			if ((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
				vitoriaJogador = vitoriaJogador + 1;
				System.out.println("Você ganhou essa rodada!!");
				System.out.println("");
			
			}else if ((jogador == 1 && maquina == 2) || (jogador == 2 && maquina == 3) || (jogador == 3 && maquina == 1)) {
				vitoriaMaquina = vitoriaMaquina + 1;
				System.out.println("A maquina ganhou essa rodada!!");
				System.out.println("");
				
			}else {
				System.out.println("Empatou essa rodada!!");
				
			}	
				
						
			contador++;
			
			System.out.println("");
		}
		if (vitoriaJogador > vitoriaMaquina) {
			System.out.println("***** Você ganhou meu cria *****");
		}else {
			System.out.println("***** O computador ganhou *****");
		}
			System.out.println("");
		
		System.out.print("Você deseja jogar mais? S/N");
		System.out.print("");
		escolha= ler.next();
		
				
		}
		while (!escolha.equalsIgnoreCase("s") && !escolha.equalsIgnoreCase("n")) {
			System.out.println("Por favor digite S caso queira continuar jogando e N caso não queira jogar mais !!!");
			System.out.println();
			escolha = ler.next();
			
		}
		ler.close();
	}

	}
