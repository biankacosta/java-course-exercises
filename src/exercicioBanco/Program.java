package exercicioBanco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of the holder: ");
		String holderName = sc.nextLine();
		
		System.out.println("Do you want to make a initial deposit? (Y for YES, N for NO): ");
		String answer = sc.next();
		
		while (!answer.equals("Y") && !answer.equals("N")) {
			System.out.println("Enter a valid answer. Y for YES, N for NO: ");
			answer = sc.next();
		}
		
		BankAccount bankAccount = null;
		
		if (answer.equals("Y")) {
			System.out.println("Enter the amount of the initial deposit: ");
			double accountBalance = sc.nextDouble();
			bankAccount = new BankAccount(accountNumber, holderName, accountBalance);
		} else {
			bankAccount = new BankAccount(accountNumber, holderName);
		}
		
		System.out.println(bankAccount);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bankAccount.deposit(deposit);
		System.out.println(bankAccount);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		bankAccount.withdraw(withdraw);
		System.out.println(bankAccount);
		
		
		sc.close();
	}

}
