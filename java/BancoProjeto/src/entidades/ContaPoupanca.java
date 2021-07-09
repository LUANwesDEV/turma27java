package entidades;

public class ContaPoupanca extends Conta {
	
	private int diaAiversarioPoupanca;

	public ContaPoupanca(int numero, String nomeCliente, int diaAiversarioPoupanca) {
		super(numero, nomeCliente);
		this.diaAiversarioPoupanca = diaAiversarioPoupanca;
	}

	public int getDiaAiversarioPoupanca() {
		return diaAiversarioPoupanca;
	}

	public void setDiaAiversarioPoupanca(int diaAiversarioPoupanca) {
		this.diaAiversarioPoupanca = diaAiversarioPoupanca;
	}
	
	
}
