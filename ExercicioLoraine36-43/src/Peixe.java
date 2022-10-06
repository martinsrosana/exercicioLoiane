
public class Peixe extends Animal {
	private String caracteristica;

	public Peixe() {
		// TODO Auto-generated constructor stub
	}

	Peixe(String nome, double comprimento, String numPatas, String cor, String ambiente, String velocidade,
			String caracteristica) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public String toString() {
		return super.toString() +
				 "Caracteristica: " + getCaracteristica();
	}

}

