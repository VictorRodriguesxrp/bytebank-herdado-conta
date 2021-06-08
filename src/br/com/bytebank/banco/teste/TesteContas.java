package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//br.com.bytebank.banco.teste.TesteContas Nome qualificado

public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaEspecial contaEspecial = new ContaEspecial(100, 500);

		ContaCorrente contaCorrente = new ContaCorrente(111, 111);
		contaCorrente.deposita(100);
		
		System.out.println(contaCorrente.getSaldo());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(112, 333);
		
		contaPoupanca.deposita(200);
		
		System.out.println(contaPoupanca.getSaldo());
		
		try {
			contaCorrente.transfere(10, contaPoupanca);			
		} catch (Exception exception) {
			System.out.println("Erro: " + exception.getMessage());
		}
		
		System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança: " + contaPoupanca.getSaldo());
		
		try {
			contaCorrente.saca(5000);
		} catch (SaldoInsuficienteException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
