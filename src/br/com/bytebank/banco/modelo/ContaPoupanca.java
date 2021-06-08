package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}
	
	@Override
	public String toString() {
		return "ContaPoupança, " + super.toString();
	}
}
