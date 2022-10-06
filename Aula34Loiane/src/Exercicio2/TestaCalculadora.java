package Exercicio2;

import java.util.Scanner;

public class TestaCalculadora {
	public static void main(String[] args) {

		int escolha;
		int n1, n2;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print(" *******CALCULADORA*******");
			System.out.println();
			System.out.println(" Digite o 1º número : ");
			n1 = scanner.nextInt();
			System.out.println(" Digite o 1º número : ");
			n2 = scanner.nextInt();

			System.out.println(" Qual o calculo que você deseja realizar:"
					+ " [1]Somar [2]Subtrair [3]Dividir [4]Multiplicar [5] Potência [6]Encerrar ");

			System.out.println(" Escolha uma das operações para começar ");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 01:

				System.out.print("O valor da soma é : " + Calculadora.soma(n1, n2));
				System.out.println();
				break;

			case 02:

				System.out.print("O valor da subtração é : " + Calculadora.subtrair(n1, n2));
				System.out.println();
				break;

			case 03:
				System.out.print("O valor da divisão é : " + Calculadora.dividir(n1, n2));
				System.out.println();
				break;

			case 04:
				System.out.print("O valor da multiplicação é : " + Calculadora.multiplicar(n1, n2));
				System.out.println();
				break;
			case 05:
				System.out.print("O valor da potência é : " + Calculadora.calcularPotencia(n1, n2));
				break;
			case 06:
				System.out.print(" Calculadora encerrada !!!");
				System.out.println();
				break;
			default:
				System.out.println("Opção inválida !!! ");
				break;
			}

		} while (escolha < 6);
		scanner.close();
	}

}
//Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
//subtrair, multiplicar, dividir (dois números), elevar à potência n.
//Desenvolva um programa para testar essa classe.