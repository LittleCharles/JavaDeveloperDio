package modulo1_desafio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta: ");
		int numeroDaConta = ler.nextInt();
		ler.nextLine();
		
		System.out.println("Por favor, digite o número da agencia: ");
		String agencia = ler.nextLine();
		
		
		System.out.println("Por favor, digite o seu nome completo: ");
		String nomeCliente = ler.nextLine();
		
		System.out.println("Por favor, digite o saldo da conta: ");
		Double saldo = ler.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
		
		
	}

}
