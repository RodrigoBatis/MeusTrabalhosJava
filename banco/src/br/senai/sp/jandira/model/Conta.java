package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	// Atributos da classe Conta
	private String numeroAgencia;
	private double saldo;
	private TipoConta tipo;
	private String numero;
	public String titular;
	
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
	
	// set numero agencia
	public void setNumeroAgencia(String numeroAgencia) {
			
		this.numeroAgencia = numeroAgencia;
	}
	
	// get numero agencia
	public String getNumeroAgencia() {
		return numeroAgencia; 
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
			System.out.println("* Não foi possível efetuar o deposito! *");
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
			System.out.println("* Não foi possível efetuar o saque! *");
			System.out.println("*************************************");
			return false;
		}
			
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			
			contaDestino.depositar(valorTransferencia);
			System.out.println("");
			System.out.println("** Realizando transferência... **");
			System.out.println("Transferência realizado com sucesso!!!");
		}else {
			System.out.println("");
			System.out.println("********************************************");
			System.out.println("* Não foi possivel efetuar a tranferência! *");
			System.out.println("********************************************");
		}
		
		
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("-----------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
	
}
