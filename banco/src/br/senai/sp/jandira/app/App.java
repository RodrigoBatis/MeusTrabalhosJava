package br.senai.sp.jandira.app;


import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// criar a agencia 
		Agencia agencia = new Agencia();
		agencia.setNumero("4214-9");
		agencia.setCidade("Carapicuiba");
		agencia.setGerente("Celso");
		agencia.setTelefone("(11) 95464-8743");
				
		// Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria da Silva");
		clienteMaria.setEmail("maria@terra.com.br");
		clienteMaria.setSalario(2000);
				
		// criação da conta da Maria
		Conta contaMaria = new Conta("7845-8"); 
		
		contaMaria.setTitular(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("");
		System.out.println("---> " + contaMaria.getTipo());
		System.out.println("---> " + contaMaria.getAgencia().getNumero());
		
		// Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@ig.com.br");
		clientePedro.setSalario(1500);
		
		
		// criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		
		contaPedro.setTitular(clientePedro);
		contaPedro.setAgencia(agencia);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		
		System.out.println("");
		System.out.println("---> " + contaPedro.getTipo());
		System.out.println("---> " + contaPedro.getAgencia().getNumero());
		
		// Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@zaz.com.br");
		clienteAna.setSalario(1900);
		
		// criação da conta da Ana
		Conta contaAna = new Conta("23145-5");
		
		contaAna.setTitular(clienteAna);
		contaAna.setAgencia(agencia);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		
		System.out.println("");
		System.out.println("--->" + contaAna.getTipo());
		System.out.println("---> " + contaAna.getAgencia().getNumero());
		
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
		
		System.out.println();
		System.out.println("***************************************");
		System.out.println(contaMaria.getTitular().getNome());
		System.out.println(contaMaria.getTitular().getEmail());
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println("***************************************");
	}

}
