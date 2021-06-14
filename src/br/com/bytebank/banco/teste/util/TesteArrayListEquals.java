package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
		//generics <>
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(101, 101);
		Conta cc2 = new ContaCorrente(102, 102);
		Conta cc3 = new ContaCorrente(102, 102);

		lista.add(cc);
		lista.add(cc2);
		
        // sobrescrevi o método equals da classe object na classe conta, para validar agencia e número.
		boolean contains = lista.contains(cc3);
		
		System.out.println(contains);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
