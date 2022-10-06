
public class Animal {
	
private String nome;
private double comprimento;
private String numPatas;
private String cor;
private String ambiente;
private String velocidade;


	Animal(String nome, double comprimento, String numPatas, String cor, String ambiente, String velocidade) {
	this.nome = nome;
	this.comprimento = comprimento;
	this.numPatas = numPatas;
	this.cor = cor;
	this.ambiente = ambiente;
	this.velocidade = velocidade;
}

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(String numPatas) {
		this.numPatas = numPatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String toString() {
		return "**********************************\n" +
			"Animal: " + getNome() + "\n"+
			"Comprimento: " + getComprimento() + "\n"+
			"Número de Patas: " + getNumPatas() +"\n"+
			"Cor: "+ getCor() + "\n"+
			"Ambiente: " + getAmbiente() +"\n"+
			"Velocidade: " + getVelocidade()+"\n";
	}
}
