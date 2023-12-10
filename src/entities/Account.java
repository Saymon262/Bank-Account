package entities;

public class Account {

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
	}
}
