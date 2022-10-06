import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int qtsPares = 0;
		int vetA[] = new int[10];

		for (int i = 0; i < vetA.length; i++) {
			System.out.print("Entre com o valor do vetor a na posição  " + i + " = ");
			vetA[i] = scanner.nextInt();
			if (vetA[i] % 2 == 0) {
				qtsPares = qtsPares + 1;
			}

		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		System.out.print("Quantidade de números pares: " + qtsPares);
		scanner.close();
	}
}

