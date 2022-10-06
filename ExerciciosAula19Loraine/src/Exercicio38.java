import java.util.Scanner;

public class Exercicio38 {
public static void main(String[] args){
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

	        int a[],b[],i;
	        a = new int[11];
	        b = new int[11];

	        for (i = 0; i <a.length; i++) {
	            System.out.println("Digite um número para um vetor A["+i+"]: ");
	            a[i] = scanner.nextInt();
	            b[i] = 0;
	        }

	        for (i=0;i<a.length;i++){
	            for (int j = i; j <=10 ; j++) {
	                b[i] = b[i] + a[j];
	            }

	        }

	        for (i=0;i<a.length;i++){
	            System.out.println("B["+i+"] = "+b[i]);
	        }
	        scanner.close();
	    }
	}

