
public class Exercicio06 {

	public static void main(String[] args) {
		 int vetA[]= {1,2,3,4,5,6,7,8,9,10};
		 int vetB[]= {1,2,3,4,5,6,7,8,9,10};

		 int vetC []= new int [10];
		 
		 for (int i= 0; i<vetC.length; i++) {
			 vetC[i] = vetA[i] + vetB[i];
			 System.out.println("O valor de C na posição "+ i + " é " + vetC[i]);
		 }
	} 

}
