package entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String holder, Integer account, Double balance, Double interestRate) {
		super(holder, account, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	
}
