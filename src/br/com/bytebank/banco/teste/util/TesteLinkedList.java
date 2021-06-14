package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {
	
	public static void main(String[] args) {
		
		//generics <>
		LinkedList<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(101, 101);
		Conta cc2 = new ContaCorrente(102, 102);
		Conta cc3 = new ContaCorrente(103, 103);
		Conta cc4 = new ContaCorrente(104, 104);
		
		lista.add(cc);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		Conta elemento = lista.get(1);
		
		System.out.println(elemento.getAgencia());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
//			println usa o método toString da classe object se foi sobrescrito na classe original (conta)
			System.out.println(lista.get(i));
		}
		
		System.out.println("--------------------------");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}
}
