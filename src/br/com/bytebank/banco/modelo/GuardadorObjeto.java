package br.com.bytebank.banco.modelo;

public class GuardadorObjeto {
	
	private Object[] referencias;
	private int posicaoReferencia;
	
	public GuardadorObjeto() {
		this.referencias = new Object[10];
	}

	public void adicionar(Object cc) {
		this.referencias[posicaoReferencia] = cc;
		this.posicaoReferencia++;
	}

	public int getQtdeElementos() {
		return this.posicaoReferencia;
	}

	public Conta getReferenciaConta(int i) {
		return (Conta) this.referencias[i];
	}
}
