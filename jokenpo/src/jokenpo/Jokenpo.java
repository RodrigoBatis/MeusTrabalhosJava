package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		// Declaração das variáveis utilizadas
				int quantidadeDePartidas = 0;
				int escolhaComputador = 0;
				int escolhaHumano = 0;
				int totalVoltas = 0;
				int vitoriasHumano = 0;
				int vitoriasComputador = 0;
				int valorVitoria = 0;
				int empates = 0;
				String resposta = "S";
				String nomeEscolhaComputador = "";
				String nomeEscolhaHumano = "";
				boolean escolhaCorreta = false;

				Scanner leitor = new Scanner(System.in);
				Random sorteio = new Random();

				// Montagem do menu e escolha das opções
				System.out.println("-----------------------------------");
				System.out.println("           J O K E N P O");
				System.out.println("-----------------------------------");
				System.out.println("");
				
				System.out.println("");

				while (resposta.equalsIgnoreCase("s")) {
					
					System.out.print("Quantas partidas? ");
					quantidadeDePartidas = leitor.nextInt();

					// Verifica se quantidade de partidas é ímpar
					while (quantidadeDePartidas % 2 != 1 || quantidadeDePartidas < 3) {
						System.out.print("Por favor, a quantidade de partidas deve ser \num número ímpar maior ou igual a 3: ");
						quantidadeDePartidas = leitor.nextInt();
					}
					
					// Determina o placar da vitória
					valorVitoria = (quantidadeDePartidas / 2) + (quantidadeDePartidas % 2);
					System.out.println();
					System.out.println("O VALOR DA VITÓRIA É: " + valorVitoria);
					System.out.println();
					
					while (totalVoltas < quantidadeDePartidas) {
						System.out.println();
						System.out.println("--------------------------------");
						System.out.println("1 - Pedra");
						System.out.println("2 - Papel");
						System.out.println("3 - Tesoura");
						System.out.println("--------------------------------");

						// Determina a escolha do computador
						escolhaComputador = sorteio.nextInt(3) + 1;
						
						System.out.println();
						System.out.println("R O D A D A  " + (totalVoltas + 1));

						if (escolhaComputador == 1) {
							nomeEscolhaComputador = "Pedra";
						} else if (escolhaComputador == 2) {
							nomeEscolhaComputador = "Papel";
						} else {
							nomeEscolhaComputador = "Tesoura";
						}

						while (escolhaCorreta == false) {

							System.out.print("Escolha uma opção [1 à 3]: ");
							escolhaHumano = leitor.nextInt();

							// Determina a escolha do humano
							if (escolhaHumano == 1) {
								nomeEscolhaHumano = "Pedra";
								escolhaCorreta = true;
							} else if (escolhaHumano == 2) {
								nomeEscolhaHumano = "Papel";
								escolhaCorreta = true;
							} else if (escolhaHumano == 3) {
								nomeEscolhaHumano = "Tesoura";
								escolhaCorreta = true;
							} else {
								System.out.println("Opção incorreta!");
							}

							System.out.println("Humano escolheu: " + nomeEscolhaHumano);
							System.out.println("Computador escolheu: " + nomeEscolhaComputador);
						}

						// Determinar vencedor
						if (escolhaHumano == 1) {
							if (escolhaComputador == 1) {
								empates++;
								System.out.println("E M P A T E ! !");
							} else if (escolhaComputador == 2) {
								vitoriasComputador++;
								System.out.println("C O M P U T A D O R  V E N C E U ! !");
							} else {
								vitoriasHumano++;
								System.out.println("H U M A N O  V E N C E U ! !");
							}
						}

						if (escolhaHumano == 2) {
							if (escolhaComputador == 1) {
								vitoriasHumano++;
								System.out.println("H U M A N O  V E N C E U ! !");
							} else if (escolhaComputador == 2) {
								empates++;
								System.out.println("E M P A T E ! !");
							} else {
								vitoriasComputador++;
								System.out.println("C O M P U T A D O R  V E N C E U ! !");
							}
						}

						if (escolhaHumano == 3) {
							if (escolhaComputador == 1) {
								vitoriasComputador++;
								System.out.println("C O M P U T A D O R  V E N C E U ! !");
							} else if (escolhaComputador == 2) {
								vitoriasHumano++;
								System.out.println("H U M A N O  V E N C E U ! !");
							} else {
								empates++;
								System.out.println("E M P A T E ! !");
							}
						}

						escolhaCorreta = false;
						totalVoltas++;

						// Verifica se algém venceu
						if (vitoriasComputador == valorVitoria) {
							System.out.println();
							System.out.println("*******************************************************************");
							System.out.println("*   O  C O M P U T A D O R  V E N C E U  O  D E S A F I O ! ! !   *");
							System.out.println("*******************************************************************");
							System.out.println();
							System.out.println("COMPUTADOR: " + vitoriasComputador);
							System.out.println("HUMANO    : " + vitoriasHumano);
							System.out.println("EMPATES   : " + empates);
							totalVoltas = quantidadeDePartidas;
						} else if (vitoriasHumano == valorVitoria) {
							System.out.println();
							System.out.println("*******************************************************************");
							System.out.println("*            V O C Ê  V E N C E U  O  D E S A F I O ! ! !         *");
							System.out.println("*******************************************************************");
							System.out.println();
							System.out.println("COMPUTADOR: " + vitoriasComputador);
							System.out.println("HUMANO    : " + vitoriasHumano);
							System.out.println("EMPATES   : " + empates);
							totalVoltas = quantidadeDePartidas;
						} else if (totalVoltas == quantidadeDePartidas) {
							quantidadeDePartidas++;
						}
						
					}
					
					System.out.println();
					System.out.println("------------------------------------------------");
					System.out.println("             J O G O  A C A B O U ! !");
					System.out.println("------------------------------------------------");
					System.out.println();
					System.out.print("Deseja desafiar o computador novamente (S/N)? ");
					resposta = leitor.next();
					
					quantidadeDePartidas = 0;
					escolhaComputador = 0;
					escolhaHumano = 0;
					totalVoltas = 0;
					vitoriasHumano = 0;
					vitoriasComputador = 0;
					valorVitoria = 0;
					empates = 0;
					escolhaCorreta = false;
					
				}
				
				System.out.println();
				System.out.println("F I M  D O  J O G O ! ! !");
				System.out.println("B Y E  B Y E ! ! !");

			}
			
			

		}
