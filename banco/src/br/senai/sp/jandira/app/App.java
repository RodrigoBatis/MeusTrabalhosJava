package br.senai.sp.jandira.app;


import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// criação da conta da Maria
		Conta contaMaria = new Conta("7845-8"); 
		// se não tiver o new não foi criado nada novo
		
		contaMaria.titular ="Maria Antonieta";
		contaMaria.setNumeroAgencia("4214-9");
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("");
		System.out.println("---> " + contaMaria.getTipo());
		System.out.println("---> " + contaMaria.getNumeroAgencia());
		
		// criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		
		contaPedro.titular = "Pedro Cabral";
		contaPedro.setNumeroAgencia("4214-9");
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		
		System.out.println("");
		System.out.println("---> " + contaPedro.getTipo());
		System.out.println("---> " + contaPedro.getNumeroAgencia());
		
		// criação da conta da Ana
		Conta contaAna = new Conta("23145-5");
		
		contaAna.titular = "Ana Gomes";
		contaAna.setNumeroAgencia("4214-9");
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		
		System.out.println("");
		System.out.println("--->" + contaAna.getTipo());
		System.out.println("---> " + contaAna.getNumeroAgencia());
		
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
