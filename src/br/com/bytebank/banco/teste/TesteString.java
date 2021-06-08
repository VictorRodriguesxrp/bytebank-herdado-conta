package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura"; // object literal
//		// String outro = new String("alura");
//		
//		String outra = nome.replace('A', 'a');
//		
		System.out.println(nome.charAt(2));
		
		System.out.println(nome.indexOf("lura"));
		
		System.out.println(nome.substring(1,3));
		
		System.out.println(nome.length());
		
		
		for (int i = 0; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " ";
		
		String vazioFormatado = vazio.trim();
		
		System.out.println(vazio.isEmpty());
		System.out.println(vazioFormatado.isEmpty());
		
		System.out.println(nome.contains("lura"));
		
//		System.out.println(nome);
//		System.out.println(outra);
	}
}


