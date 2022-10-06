package Exercicio2;

public class Recursivo {

	public static int soma(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + soma(n - 1);
		}
	}
}