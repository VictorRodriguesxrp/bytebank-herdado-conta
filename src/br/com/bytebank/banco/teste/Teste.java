package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println(false);
		
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		ContaCorrente cc = new ContaCorrente(22, 33);
		
		println(1);
		println(cc.toString());
		println(cp);
	}
	
	static void println() {
		System.out.println("Vazio");
	}
	
	static void println(int a) {
		System.out.println("Inteiro: " + a);
	}
	
	static void println(boolean valor) {
		System.out.println("Booleano: " + valor);
	}
	
	static void println(Object object) {
		System.out.println("Objeto: " + object);
	}
}
