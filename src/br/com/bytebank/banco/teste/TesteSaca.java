package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 123);
		
		conta.deposita(500);
		
		try {
			conta.saca(1000);			
		} catch (SaldoInsuficienteException exception) {
			System.out.println("Exceção: " + exception.getMessage());
			exception.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}

}
