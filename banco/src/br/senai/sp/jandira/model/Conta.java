package br.senai.sp.jandira.model;

public class Conta {
	
	// Atributos da classe Conta
	public String numeroAgencia;
	private double saldo;
	public String tipo;
	private String numero;
	public String titular;
	
	// Construtores da classe Conta
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	// Metodos da classe Conta
	public void depositar(double valorDeposito) {
		if (valorDeposito >= 0) {
			System.out.println("");
			System.out.println("** Realizando deposito... **");
			System.out.println("Deposito realizado com sucesso!!!");
			saldo += valorDeposito;
		}else {
			System.out.println("");
			System.out.println("****************************************");
			System.out.println("* N�o foi poss�vel efetuar o deposito! *");
			System.out.println("****************************************");
		}
		
		
	}
	
	public boolean sacar(double valorSaque) {
		if (valorSaque > 0 && valorSaque <= saldo) {
			System.out.println("");
			System.out.println("** Realizando saque... **");
			System.out.println("Saque realizado com sucesso!!!");
			saldo -= valorSaque;
			return true;
		}else {
			System.out.println("");
			System.out.println("*************************************");
			System.out.println("* N�o foi poss�vel efetuar o saque! *");
			System.out.println("*************************************");
			return false;
		}
			
	}
	
	public void transferir(Conta contaDestino, double valorTransferncia) {
		boolean resultado = sacar(valorTransferncia);
		
		if (resultado) {
			
			contaDestino.depositar(valorTransferncia);
			System.out.println("");
			System.out.println("** Realizando transfer�ncia **");
			System.out.println("Transfer�ncia realizado com sucesso!!!");
		}else {
			System.out.println("");
			System.out.println("********************************************");
			System.out.println("* N�o foi possivel efetuar a tranfer�ncia! *");
			System.out.println("********************************************");
		}
		
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("-----------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
	
}
