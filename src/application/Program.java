package application;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account account = new Account("Alex", 1001, 0.0);
		BusinessAccount bAccount = new BusinessAccount("Maria", 1002, 0.0, 500.0);
		
		//Upcasting
		Account account01 = bAccount;
		Account account02 = new BusinessAccount("Bob", 1003, 0.0, 200.0);
		Account account03 = new SavingsAccount("Ana", 1004, 0.0, 0.01);
		
		//Downcasting
		BusinessAccount account05 = (BusinessAccount)account02;
		account05.loan(100.0);
		
		if(account02 instanceof BusinessAccount) {
			BusinessAccount account06 = (BusinessAccount)account02;
			account06.loan(200.0);System.out.println("Loan!");
		}
		
		if(account03 instanceof SavingsAccount) {
			SavingsAccount account06 = (SavingsAccount)account03;
			account06.updateBalance();
			System.out.println("UPDATE!");
		}
		
		System.out.println("Insira o nome do titular da conta");
		String holder = scan.next();
		
		System.out.println("Insira o número da conta bancária");
		Integer account1 = scan.nextInt();

		
		System.out.println("Você deseja depositar um valor inicial na sua conta? s / n");
		scan.nextLine();
		char opcao = scan.next().charAt(0);
		if (opcao == 's'){
			System.out.println("Insira o valor de deposito inicial");
			double balance = scan.nextDouble();
			Account account04 = new Account(holder, account1, balance);
		} else {
			Account account04 = new Account(holder, account1);
		}
		
		System.out.println("\n\n" + account1.toString());
		
		
		//deposito
		System.out.println("Insira o valor do deposito");
		double amount  = scan.nextDouble();
		account.deposit(amount);
		 
		System.out.println("\n" + account1.toString());
		 
		
		//saque
		System.out.println("Insira o valor do saque");
		amount  = scan.nextDouble();
		account.withdraw(amount);
		
		System.out.println("\n" + account1.toString());

		scan.close();
	}

}
