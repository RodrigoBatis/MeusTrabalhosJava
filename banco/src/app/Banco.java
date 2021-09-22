package app;

import model.Conta;

public class Banco {

	public static void main(String[] args) {
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.titular = "Maria Antonieta";
		contaDaMaria.agencia = "5521-7";
		contaDaMaria.numero = "7845-5";
		contaDaMaria.tipoConta = "Corrente";
		contaDaMaria.saldo = 1000;
		
		Conta contaDoPedro = new Conta ();
		contaDoPedro.titular = "Pedro Cabral";
		contaDoPedro.agencia = "5521-7";
		contaDoPedro.numero = "8945-5";
		contaDoPedro.tipoConta = "Poupança";
		contaDoPedro.saldo = 500;
		
		// Mostrar saldo da Maria
		
		System.out.println("Seu Saldo é " + contaDaMaria.saldo);
		System.out.println("");
		
		// Mostrar saldo da Pedro
		
		System.out.println("Seu saldo é " + contaDoPedro.saldo);
		
		// depositar 100 reais na conta da Maria
		contaDaMaria.depositar(100);
		
		System.out.println("");
		System.out.println("Seu Saldo é " + contaDaMaria.saldo);
		System.out.println("");
		
		// depositar 50 reais na conta da Pedro
		
		contaDoPedro.depositar(50);
		System.out.println("Seu Saldo é " + contaDoPedro.saldo);
		System.out.println("");
		
	}

}
