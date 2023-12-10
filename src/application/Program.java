package application;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Insira o nome do titular da conta");
		String name = scan.next();
		
		System.out.println("Insira o número da conta bancária");
		int conta = scan.nextInt();

		
		System.out.println("Você deseja depositar um valor inicial na sua conta? s / n");
		scan.nextLine();
		char opcao = scan.next().charAt(0);
		if (opcao == 's'){
			System.out.println("Insira o valor de deposito inicial");
			double depositoInicial = scan.nextDouble();
			account = new Account(name, conta, depositoInicial);
		} else {
			account = new Account(name, conta);
		}
		
		System.out.println("\n\n" + account.toString());
		
		
		//deposito
		System.out.println("Insira o valor do deposito");
		double deposito  = scan.nextDouble();
		account.deposito(deposito);
		 
		System.out.println("\n" + account.toString());
		 
		
		//saque
		System.out.println("Insira o valor do saque");
		double saque  = scan.nextDouble();
		account.saque(saque);
		
		System.out.println("\n" + account.toString());

		scan.close();
	}

}
