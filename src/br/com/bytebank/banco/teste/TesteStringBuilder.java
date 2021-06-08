package br.com.bytebank.banco.teste;

public class TesteStringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("por ");
		builder.append("favor!");
		
		String texto = builder.toString();
		
		System.out.println(texto);
	}
}
