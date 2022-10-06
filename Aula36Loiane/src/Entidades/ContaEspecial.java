package Entidades;

public class ContaEspecial extends ContaBancaria {
	 private static double limite;

	public static double getLimite() {
		return limite;
	}

	public static void setLimite(double limite) {
		ContaEspecial.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [Nome Cliente: " + getNomeCliente() + ", Conta Especial Número: " + getNumConta()
				 + ", Saldo: " + getSaldo() + "]";
	}
	
	public boolean sacarEspecial (double valor) {
		double saldoComLimite = getSaldo()+ limite;
		if ((saldoComLimite -valor)>= 0) {
			setSaldo(getSaldo()-valor);
			return true;
		}
		return false;
	}
}
