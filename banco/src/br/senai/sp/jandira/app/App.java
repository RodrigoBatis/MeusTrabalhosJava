package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// criação da conta da Maria
		Conta contaMaria = new Conta("7845-8"); 
		// se não tiver o new não foi criado nada novo
		
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.depositar(500);
		contaMaria.tipo = "Corrente";
		
		// criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		
		contaPedro.titular = "Pedro Cabral";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.depositar(200);
		contaPedro.tipo = "Poupança";
		
		// criação da conta da Ana
		Conta contaAna = new Conta("23145-5");
		
		contaAna.titular = "Ana Gomes";
		contaAna.numeroAgencia = "4214-9";
		contaAna.depositar(2000);
		contaAna.tipo = "Corrente";
		
		// exibir os detalhes das contas
		
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		// Depositar 100 reais na conta da Maria
		
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar 300 reis da conta da Maria
		
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		// Depositar -200 na conta do Pedro
		
		contaPedro.depositar(200);
		contaPedro.exibirDetalhes();
		
		// Sacar -100 da conta da Maria
		
		contaMaria.sacar(-100);
		contaMaria.exibirDetalhes();
		
		// Transferir 100 reais da conta do Pedro para conta da Maria
		
		contaPedro.transferir(contaMaria, 100);
		
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
		
		
	}

}
