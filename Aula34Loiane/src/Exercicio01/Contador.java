package Exercicio01;

public class Contador {
	private static int conta;

	public Contador() {
		conta++;
	}

	public static void incrementar() {
		conta++;
	}

	public static int retornarValor() {
		return conta;
	}
	public static void zerar() {
		conta = 0;
	}
}
	
//Escreva uma classe chamada Contador, que tem um atributo estático que
//é incrementado sempre que a classe for instanciada. Crie métodos para
//zerar, incrementar e retornar o valor do contador. Desenvolva um
//programa para testar essa classe.