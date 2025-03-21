package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo ao nosso caixa eletrônico. Vamos criar a sua conta agora mesmo!");
		System.out.printf("Por favor, digite o nome do titular da conta: ");
		String titular = sc.nextLine();
		System.out.printf("Por favor, digite o número da conta: ");
		int numeroDaConta = sc.nextInt();
		System.out.printf("Digite o quanto gostaria de depositar inicialmente: ");
		double depositoInicial = sc.nextDouble();

		Conta conta;

		if (depositoInicial > 0) {
			conta = new Conta(numeroDaConta, titular, depositoInicial);
		} else {
			conta = new Conta(numeroDaConta, titular);
		}

		System.out.printf("Conta criada! Número: %d, Titular: %s, Saldo: R$ %.2f%n", conta.getNumeroDaConta(),
				conta.getTitular(), conta.getSaldo());

		System.out.println("-----------------");
		char program = 'y';
		while (program == 'y') {
			System.out.println(
					"Quais operações você gostaria de fazer? [1]. Sacar [2]. Depositar [3]. Abrir uma nova conta [4]. Encerrar");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.printf("Quanto você gostaria de sacar? ");
				double quantity = sc.nextDouble();
				conta.sacar(quantity);
				System.out.printf("Você sacou R$ %.2f e agora o seu saldo é R$ %.2f%n", quantity, conta.getSaldo());
				break;
			case 2:
				System.out.printf("Quanto você gostaria de depositar? ");
				double deposito = sc.nextDouble();
				conta.depositar(deposito);
				System.out.printf("Você depositou R$ %.2f e agora o seu saldo é R$ %.2f%n", deposito, conta.getSaldo());
				break;
			case 3:
				main(args);
				break;
			case 4:
				program = 'n';
				break;
			}
		}

		System.out.println("Obrigado por utilizar o nosso caixa eletrônico. Até mais!");
		sc.close();

	}

}
