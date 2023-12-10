package application;
import java.util.Scanner;
<<<<<<< HEAD

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
=======
import entities.Account;
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
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
=======
		Account account;
		
		
		System.out.println("Insira o nome do titular da conta");
		String name = scan.next();
		
		System.out.println("Insira o número da conta bancária");
		int conta = scan.nextInt();
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41

		
		System.out.println("Você deseja depositar um valor inicial na sua conta? s / n");
		scan.nextLine();
		char opcao = scan.next().charAt(0);
		if (opcao == 's'){
			System.out.println("Insira o valor de deposito inicial");
<<<<<<< HEAD
			double balance = scan.nextDouble();
			Account account04 = new Account(holder, account1, balance);
		} else {
			Account account04 = new Account(holder, account1);
		}
		
		System.out.println("\n\n" + account1.toString());
=======
			double depositoInicial = scan.nextDouble();
			account = new Account(name, conta, depositoInicial);
		} else {
			account = new Account(name, conta);
		}
		
		System.out.println("\n\n" + account.toString());
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41
		
		
		//deposito
		System.out.println("Insira o valor do deposito");
<<<<<<< HEAD
		double amount  = scan.nextDouble();
		account.deposit(amount);
		 
		System.out.println("\n" + account1.toString());
=======
		double deposito  = scan.nextDouble();
		account.deposito(deposito);
		 
		System.out.println("\n" + account.toString());
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41
		 
		
		//saque
		System.out.println("Insira o valor do saque");
<<<<<<< HEAD
		amount  = scan.nextDouble();
		account.withdraw(amount);
		
		System.out.println("\n" + account1.toString());
=======
		double saque  = scan.nextDouble();
		account.saque(saque);
		
		System.out.println("\n" + account.toString());
>>>>>>> 7c73ccff8df522e89b8932293f4a2851f5e69c41

		scan.close();
	}

}
