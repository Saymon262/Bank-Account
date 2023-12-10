package entities;

public class Account {

	private String name;
	private int conta;
	private double saldo;
	
	
	public Account(String name, int conta) {
		this.name = name;
		this.conta = conta;
	}

	public Account(String name, int conta, double depositoInicial) {
		this.name = name;
		this.conta = conta;
		deposito(depositoInicial);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor + 5.0;
	}

	public String toString() {
		return "Titular: " + name + "\nConta: " + conta + "\nSaldo: " + saldo;
	}
}
