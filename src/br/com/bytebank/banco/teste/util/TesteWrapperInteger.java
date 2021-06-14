package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
//		Integer idadeRef = new Integer(29);
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing;
		
		int valor = idadeRef.intValue(); // unboxing;
		
		String s = args[0];
		
//		Integer numero = Integer.valueOf(s);
		Integer numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
	}
}
