package entities;

public class Account {

<<<<<<< HEAD
	private String holder;
	private Integer account;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(String holder, Integer account) {
		super();
		this.holder = holder;
		this.account = account;
	}

	public Account(String holder, Integer account, Double balance) {
		this.holder = holder;
		this.account = account;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw (double amount) {
		balance -= amount;
	}
	
	public void deposit (double amount) {
		balance += amount;
	}

	public String toString() {
		return "Titular: " + holder + "\nConta: " + account + "\nSaldo: " + balance;
=======
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
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41
	}
}
