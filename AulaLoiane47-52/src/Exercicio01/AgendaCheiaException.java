package Exercicio01;

public class AgendaCheiaException extends Exception {
	@Override
	public String getMessage() {

		return "Agenda já está cheia.";
	}

}
