package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Object[] referencias = new Conta[5];
		
//		ContaCorrente[] contasCorrente = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(101, 101);
		ContaPoupanca cc2 = new ContaPoupanca(102, 102);
		
		referencias[0] = cc1;
		referencias[1] = cc2;
		
		Conta ref = ((Conta) referencias[1]);
		
		System.out.println(referencias[0]);
		System.out.println(referencias[1]);
		
		ContaPoupanca ref2 = ((ContaPoupanca) referencias[1]);
		
//		System.out.println(referencias[1].getNumero());
		System.out.println(ref.getNumero());

		System.out.println(ref2);
	}
}
