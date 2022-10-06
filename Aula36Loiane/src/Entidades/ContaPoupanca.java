package Entidades;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

	private static int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	@SuppressWarnings("static-access")
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [Dia Rendimento: " + diaRendimento + ", Nome Cliente: " + getNomeCliente()
				+ ", número da Conta Poupança " + getNumConta() + ", Saldo: " + getSaldo() + "]";
	}

	public static boolean calcularSaldoRendimento(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}
}