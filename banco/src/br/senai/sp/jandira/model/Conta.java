package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	// Atributos da classe Conta
	private Agencia agencia;
	private double saldo;
	private TipoConta tipo;
	private String numero;
	private Cliente titular;
	
	// Metodo Construtor
	public Conta(String numeroConta) {
		
		numero = numeroConta;
	}
	
	// set tipo conta
	public void setTipo(TipoConta tipo){
		
		this.tipo = tipo;
	}
	
	// get tipo conta
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
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
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			
			contaDestino.depositar(valorTransferencia);
			System.out.println("");
			System.out.println("** Realizando transfer�ncia... **");
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
		System.out.printf("Titular: %s\n", titular.getNome());
		System.out.printf("E-mail: %s\n", titular.getEmail());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
	
}
