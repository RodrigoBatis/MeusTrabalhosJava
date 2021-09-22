package model;

public class Conta {
	
	public String agencia;
	public double saldo;
	public String tipoConta;
	public String numero;
	public String titular;
	
	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}
	
	void sacar(double valorSaque) {
		
	}
	
	void transferir(double valorTransferencia) {
		
	}
	
	
}
