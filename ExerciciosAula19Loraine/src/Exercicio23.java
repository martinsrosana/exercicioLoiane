import java.util.Random;
public class Exercicio23 {

			int[] vetorA = new int[10];
			Random random = new Random();{

			for (int i = 0; i < vetorA.length; i++) {
				vetorA[i] = random.nextInt(10);
				
				

				if (vetorA[i] % 2 != 0) {
					
					
					break;
					
				}
				System.out.println(vetorA[i]);
			}

		}

	}
