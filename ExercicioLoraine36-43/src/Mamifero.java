
public class Mamifero extends Animal {
	private String alimento;

	public Mamifero() {
		// TODO Auto-generated constructor stub
	}

	Mamifero(String nome, double comprimento, String numPatas, String cor, String ambiente, String velocidade,
			String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() +
		"Alimento: " + getAlimento();
	}

}
