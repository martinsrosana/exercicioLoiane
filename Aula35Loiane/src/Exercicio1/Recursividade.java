package Exercicio1;

public class Recursividade {

	public static int calcularFibonacci (int num) {
		if (num<2) {
			return 1;
		}
		return calcularFibonacci (num-1)+ calcularFibonacci (num-2);
	}
}


//Escreva um método recursivo e estático que calcule e retorne o N-ésimo
//termo da sequência Fibonacci. Alguns números desta sequência são: 0, 1,
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89...