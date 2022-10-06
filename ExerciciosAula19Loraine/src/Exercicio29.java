import java.util.Scanner;

public class Exercicio29 {

	public Exercicio29() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int vetA[] = new int[10];
		int vetB[] = new int[vetA.length];
		int vetC[] = new int[vetA.length * 2];

		for (i = 0; i < vetA.length; i++) {
			System.out.print("Vetor A na posição " + i + " = ");
			vetA[i] = scanner.nextInt();
			vetC[i] = vetA[i];
		}

		for (i = 0; i < vetB.length; i++) {
			System.out.print(" Vetor B na posição " + i + " = ");
			vetB[i] = scanner.nextInt();
			vetC[vetA.length + i] = vetB[i];

		}

		for (i = 0; i < vetC.length; i++) {
			System.out.println(" Vetor C na posição " + i + " = " + vetC[i]);
		}
		scanner.close();
	}
}