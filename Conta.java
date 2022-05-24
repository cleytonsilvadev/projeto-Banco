package atividade;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	public Conta(String titular,int numero) {
		this.titular = titular;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void verificarSaldo() {
		System.out.println("Seu saldo é: " + this.saldo);
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("seu saldo é insuficiente ");
		}
	}

	public void depositar(double valor) {
		this.saldo = valor + this.saldo;

	}

	public void transferir(double valor, Conta destino) {
		if (valor <= this.saldo) {
			this.sacar(valor);

			destino.depositar(valor);

		} else {
			System.out.println("seu saldo é insuficiente ");
		}

	}

}
