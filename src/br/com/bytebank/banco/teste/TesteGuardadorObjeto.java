package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorObjeto;

public class TesteGuardadorObjeto {

	public static void main(String[] args) {
		
		GuardadorObjeto guardadorObjeto = new GuardadorObjeto();
		
		Conta cc = new ContaCorrente(100, 200);
		Conta cc2 = new ContaCorrente(1500, 300);
		
		guardadorObjeto.adicionar(cc);
		guardadorObjeto.adicionar(cc2);
		
		int tamanho = guardadorObjeto.getQtdeElementos();
		
		System.out.println("Existem " + tamanho + " contas cadastradas.");
		
		System.out.println(guardadorObjeto.getReferenciaConta(0).getAgencia());
	}

}
