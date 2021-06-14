package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing;
		int valor = idadeRef.intValue(); // unboxing;
		
		System.out.println(valor);
		
		Double dRef = Double.valueOf(3.2);
		double valorDouble = dRef.doubleValue();
		
		System.out.println(valorDouble);
		
		Boolean bRef = Boolean.FALSE;
		
		System.out.println(bRef.booleanValue());
	}
}
