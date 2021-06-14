package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		int idade1 = 19;
		
		for (int i = 0; i < idades.length; i ++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i ++) {
			System.out.println(idades[i]);
		}
		
//		try {
//			int idade4 = idades[49];			
//		} catch (Exception err) {
//			System.out.println("Deu exceção: " + err.getMessage());
//		}
		
		System.out.println(idades[3]);		
		
		System.out.println(idades.length);
	}
}
