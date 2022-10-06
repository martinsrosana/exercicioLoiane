package Entidades;

public class ContaBancaria {
	
	
	private  String nomeCliente;
	private  String numConta;
	private static  double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	@SuppressWarnings("static-access")
	public static double getSaldo() {
		return saldo;
	}

	@SuppressWarnings("static-access")
	public static void setSaldo(double saldo) {
		ContaBancaria.saldo = saldo;
	}

	
	@Override
	public String toString() {
		return "ContaBancaria [Cliente: " + getNomeCliente() + ", Número Conta: " + getNumConta()
				+ ", Saldo: " + getSaldo() + "]";
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	public boolean sacar (double valor) {
		if ((saldo-valor)>=0) {
			saldo -=valor;
			return true;
		}
		return false;
	}
}

	