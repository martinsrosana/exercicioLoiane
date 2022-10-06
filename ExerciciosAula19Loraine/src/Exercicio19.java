import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nota1[] = new double[10];
		double nota2[] = new double[nota1.length];
		double mediaFinal[] = new double[nota1.length];

		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Entre com a nota 1 do Aluno " + (i + 1));
			nota1[i] = scanner.nextDouble();

			System.out.println("Entre com a nota 2 do Aluno " + (i + 1));
			nota2[i] = scanner.nextDouble();

			mediaFinal[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println("A média final do aluno " + (i + 1) + " é = " + mediaFinal[i]);
			if (mediaFinal[i] <= 6) {
				System.out.println("Aluno Reprovado!");
			} else {
				System.out.println("Aluno Aprovado!");
			}
		}
		scanner.close();
	}

}
