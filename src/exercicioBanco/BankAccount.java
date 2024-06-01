package exercicioBanco;

public class BankAccount {
	
	private int accountNumber;
	private String holderName;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String holderName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		deposit(accountBalance);
	}
	
	public BankAccount(int accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double value) {
		this.accountBalance += value;
	}
	
	public void withdraw(double value) {
		this.accountBalance -= value + 5;
	}
	
	public void changeHolderName(String newHolderName) {
		this.holderName = newHolderName;
	}
	
	public String toString() {
		 return "Account " + accountNumber + ", Holder: " + holderName + ", Balance: R$" + String.format("%.2f", accountBalance);
	}
	

}
