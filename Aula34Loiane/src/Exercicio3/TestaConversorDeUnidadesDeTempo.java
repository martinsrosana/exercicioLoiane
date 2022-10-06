package Exercicio3;

import java.util.Scanner;

public class TestaConversorDeUnidadesDeTempo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		int escolha = 0;
		do {

			System.out.println("Informe o número que deseja converter: ");
			numero = scanner.nextInt();
			System.out.println();
			System.out.println("Digite o número que de seja converter as medidas de tempo: ");
			System.out.println("[1]Minutos [2]Horas [3]Dia [4]Semanas [5]Mês [6]Anos [7]Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:

				System.out.print(
						" A conversão é :" + ConversaoDeUnidadesDeTempo.converterParaMinutos(numero) + " minuto(s). ");
				System.out.println();
				break;

			case 2:
				System.out
						.print(" A conversão é :" + ConversaoDeUnidadesDeTempo.converterParaHoras(numero) + " hora(s)");
				System.out.println();
				break;

			case 3:
				System.out.print(" A conversão é :" + ConversaoDeUnidadesDeTempo.converterDia(numero) + " dia(s)");
				System.out.println();
				break;

			case 4:
				System.out.print(
						" A conversão é :" + ConversaoDeUnidadesDeTempo.converterParaSemanas(numero) + " semana(s)");
				System.out.println();
				break;

			case 5:
				System.out
						.print(" A conversão é :" + ConversaoDeUnidadesDeTempo.converterParaMeses(numero) + " mês(es)");
				System.out.println();
				break;

			case 6:
				System.out
						.print(" A conversão é :" + ConversaoDeUnidadesDeTempo.converterParaAnos(numero) + " anos(s)");
				break;

			case 7:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("opção inválida");
				break;
			}
		} while (escolha < 7);
		scanner.close();
	}
}
