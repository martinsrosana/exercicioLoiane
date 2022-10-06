package Aplicação;

import java.util.Scanner;

import Entidades.ContaBancaria;
import Entidades.ContaEspecial;
import Entidades.ContaPoupanca;

public class TestaContaBancária {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		int resposta = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("***Bem vindo a sua conta ***");

		System.out.println("Qual tipo de Conta deseja Abrir?");
		System.out.println("[1] Comum [2] Poupança [3] Conta com Limite Especial");
		resposta = scanner.nextInt();

		switch (resposta) {
		case 1:
			ContaBancaria novaConta = new ContaBancaria();
			novaConta.setNomeCliente("Rosana Martins");
			novaConta.setNumConta("0001-01");

			System.out.println("Qual operação deseja realizar? [1] depositar [2] Sacar ");
			int operacao = scanner.nextInt();
			if (operacao == 1) {
				System.out.println("Qual valor deseja depositar? ");
				double valor = scanner.nextDouble();
				novaConta.depositar(valor);
				;
			} else if (operacao == 2) {
				System.out.println("Qual valor deseja sacar? ");
				double valor = scanner.nextDouble();
				novaConta.sacar(valor);
			}
			System.out.println(novaConta);
		case 2:
			ContaPoupanca novaPoupanca = new ContaPoupanca();

			novaPoupanca.setNomeCliente("Artemis Martins");
			novaPoupanca.setNumConta("0002-02");
			novaPoupanca.setDiaRendimento(14);
			
			System.out.println("Qual operação deseja realizar? [1] depositar [2] Sacar ");
			int operacaoPoupanca = scanner.nextInt();
			if (operacaoPoupanca == 1) {
				System.out.println("Qual valor deseja depositar? ");
				double valor = scanner.nextDouble();
				novaPoupanca.depositar(valor);

			} else if (operacaoPoupanca == 2) {
				System.out.println("Qual valor deseja sacar? ");
				double valor = scanner.nextDouble();
				novaPoupanca.sacar(valor);
			}

			if (ContaPoupanca.calcularSaldoRendimento(0.5)) {
				System.out.println("Rendimento aplicado, novo saldo é de " + novaPoupanca.getSaldo());
			} else {
				System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
			}
			System.out.println(novaPoupanca);

		case 3:

			ContaEspecial contaEspecial = new ContaEspecial();
			contaEspecial.setNomeCliente("Mila Martins ");
			contaEspecial.setNumConta("0303-03");
			contaEspecial.setLimite(100);

			System.out.println("Qual operação deseja realizar? [1] depositar [2] Sacar ");
			int operacaoEspecial = scanner.nextInt();
			if (operacaoEspecial == 1) {
				System.out.println("Qual valor deseja depositar? ");
				double valor = scanner.nextDouble();
				contaEspecial.depositar(valor);

			} else if (operacaoEspecial == 2) {
				System.out.println("Qual valor deseja sacar? ");
				double valor = scanner.nextDouble();
				contaEspecial.sacarEspecial(valor);
			}
			System.out.println(contaEspecial);


		}
		scanner.close();
	}
}
