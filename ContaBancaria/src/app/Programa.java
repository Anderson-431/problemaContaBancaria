package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Digite o n?mero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digiti o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Existe um dep?sito inicial (s / n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Insira o valor do dep?sito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		//Deposito
		System.out.println();
		System.out.print("Insira um valor de dep?sito: ");
		double valorDoDeposito = sc.nextDouble();
		conta.deposito(valorDoDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		//Saque
		System.out.println();
		System.out.print("Insira um valor de saque: ");
		double valorDoSaque = sc.nextDouble();
		conta.saque(valorDoSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
