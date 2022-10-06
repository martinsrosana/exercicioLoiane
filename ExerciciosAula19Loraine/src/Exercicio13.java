import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int soma = 0;

		int vetA[] = new int[10];
		for (i = 0; i < vetA.length; i++) {
			System.out.print("Entre com um número para a posição " + i + " = ");
			vetA[i] = scanner.nextInt();
			if (vetA[i] % 5 == 0) {
				soma = soma + 1;
			}
		}
		System.out.print("Vetor A = ");
		for (i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		System.out.print("A quantidade de números do Vetor A que são divisíveis por 5 é : " + soma);
		
		scanner.close();

	}

}
