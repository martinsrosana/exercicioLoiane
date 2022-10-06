package Exercicio3;

public class ConversaoDeUnidadesDeTempo {

	public ConversaoDeUnidadesDeTempo() {
	}

	public static int converterParaMinutos(int numero) {
		return numero / 60;
	}

	public static int converterParaHoras(int numero) {
		return numero / 60;
	}

	public static int converterDia(int numero) {
		return numero / 24;
	}

	public static int converterParaSemanas(int numero) {
		return numero / 7;
	}

	public static int converterParaMeses(int numero) {
		return numero / 30;
	}

	public static double converterParaAnos(double numero) {
		return 365.25 / numero;
	}

}
