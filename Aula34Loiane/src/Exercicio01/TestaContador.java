package Exercicio01;

public class TestaContador {

	
		public static void main(String[] args) {

			imprimirValor();

			Contador.incrementar();

			imprimirValor();

			Contador.zerar();

			imprimirValor();

			Contador.incrementar();
			Contador.incrementar();
			Contador.incrementar();

			imprimirValor();
			
			
		}
		static void imprimirValor() {
			System.out.println(Contador.retornarValor());
		}
	}
