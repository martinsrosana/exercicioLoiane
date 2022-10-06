import java.util.Scanner;

public class Exercicio24 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int vetA[]= new int [10];
		int i = 0;
		
		for ( i = 0; i<vetA.length; i++) {
			System.out.print("Entre com valor do vetor A  na posição " + (i)+ " : ");
			vetA[i] = scanner.nextInt();
		}
	
			boolean palindromo = true;
			 for (i =0; i<vetA.length/2; i++) {
				 
				 if (vetA[i] != vetA[vetA.length -1 -i]) {
					 palindromo = false;
					 break;
			 }
		}
		System.out.println("___Vetor A___");
		for (i =0; i<vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println();
		
		if (palindromo) {
			System.out.println("É um palindromo!");
		}else {
			System.out.println("Não é um palindromo!");
		}
		
		scanner.close();
	}

}
