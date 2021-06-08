package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		calculador.registra(contaCorrente);
		calculador.registra(seguro);
		
		System.out.println(calculador.getTotalImposto());
	}

}
