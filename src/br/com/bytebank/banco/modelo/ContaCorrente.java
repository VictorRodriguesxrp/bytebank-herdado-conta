package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero); 
		// est� implicitamente chamando o construtor "PADRAO" ou "ESPEC�FICO" da classe m�e
	}
	
	public void deposita(double valor) {
		super.setSaldo(super.getSaldo() + valor);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor + 0.2);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
}
