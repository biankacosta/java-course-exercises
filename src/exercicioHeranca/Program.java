package exercicioHeranca;

public class Program {
	
	public static void main(String[] args) {

			BankAccount acc1 = new BankAccount(1001, "Alex", 1000.0);
			acc1.withdraw(200.0);
			System.out.println(acc1.getBalance());
			
			BankAccount acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
			acc2.withdraw(200.0);
			System.out.println(acc2.getBalance());
			
			BankAccount acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
			acc3.withdraw(200.0);
			System.out.println(acc3.getBalance());
		}

}
