package br.com.bytebank.banco.teste;

public class TesteString2 {
	
	public static void main(String[] args) {
		
		String nome = "Mario";
		String outro = new String("Alura");
		
		String novo = outro.replace("A", "a");
		
		System.out.println(novo);
		
		novo = nome.toLowerCase();
		
		System.out.println(novo);
		
		char c = nome.charAt(3);
		
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		
		System.out.println(pos);
		
		String sub = nome.substring(1, 3);
		
		System.out.println(sub);
		
		for(int i = 0; i < nome.length(); i ++) {
			System.out.println(nome.charAt(i));
		}
		
		
		String testeSplit[] = new String[2];
		
		testeSplit = nome.split("r");
		
		System.out.println(testeSplit[1]);
	}
}
