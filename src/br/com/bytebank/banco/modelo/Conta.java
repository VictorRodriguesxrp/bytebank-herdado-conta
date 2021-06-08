package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * @author Victor
 *
 */

public abstract class Conta {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		total ++;
		//System.out.println("O total de contas abertas até o momento é " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		
		//System.out.println("Estou criando uma conta: " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor ) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public boolean transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		
		if (this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} 
		
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero < 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia < 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero;
	}
}
